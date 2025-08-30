-- Approach 1: UNION ALL all requester & accepter IDs, then COUNT occurrences.
-- Simple, but creates more intermediate rows before grouping.

SELECT id , COUNT(*) AS num 
FROM (
    SELECT requester_id AS id 
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id
    FROM RequestAccepted
) ids
GROUP BY id
ORDER BY num DESC
LIMIT 1;


-- Approach 2: GROUP early by requester/accepter, then SUM their friend_count.
-- More efficient: fewer intermediate rows, lower memory use, faster on large data.

SELECT id , SUM(friend_count) AS num
FROM (
    SELECT requester_id AS id , COUNT(*) AS friend_count
    FROM RequestAccepted
    GROUP BY requester_id
    UNION ALL
    SELECT accepter_id AS id , COUNT(*) AS friend_count
    FROM RequestAccepted
    GROUP BY accepter_id 
) ids
GROUP BY id
ORDER BY num DESC
LIMIT 1;
