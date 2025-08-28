-- Approach 1: Self-Join + HAVING, higher memory use due to join, slower on large data.  

SELECT a1.player_id , a1.event_date AS first_login 
FROM Activity a1
JOIN Activity a2 ON a1.player_id = a2.player_id
GROUP BY a1.player_id , a1.event_date 
HAVING a1.event_date = MIN(a2.event_date);


-- Approach 2: GROUP BY + MIN, lower memory use and faster performance, best choice.  

SELECT player_id , MIN(event_date) AS first_login 
FROM Activity
GROUP BY player_id;
