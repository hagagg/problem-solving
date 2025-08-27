-- Approach 1: Correlated Subquery - finds duplicates by counting occurrences per email,
-- may be slower on large tables because the subquery runs for each row.

SELECT DISTINCT p.email AS Email
FROM Person p
WHERE (
    SELECT COUNT(*)
    FROM Person p2
    WHERE p.email = p2.email
) > 1;


-- Approach 2: GROUP BY + HAVING - more efficient and readable for large tables,
-- counts emails per group and filters groups with more than one occurrence.

SELECT p.email AS Email
FROM Person p
GROUP BY p.email
HAVING COUNT(p.email) > 1;
