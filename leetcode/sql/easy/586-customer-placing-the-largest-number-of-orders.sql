SELECT customer_number 
FROM (
    SELECT customer_number , COUNT(*) AS order_count
    FROM Orders
    GROUP BY customer_number
) t
ORDER BY order_count DESC
LIMIT 1;
