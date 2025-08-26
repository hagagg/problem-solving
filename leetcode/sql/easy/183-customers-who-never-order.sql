-- Approach 1: NOT EXISTS - less memory, may be slower on large tables.

SELECT name AS Customers
From Customers c
WHERE NOT EXISTS (
    SELECT customerId
    From Orders o
    WHERE c.id = o.customerId
);


-- Approach 2: LEFT JOIN + IS NULL - uses more memory but often faster on large tables.

SELECT name AS Customers
From Customers c
LEFT JOIN Orders o ON c.id = o.customerId
WHERE o.customerId IS NULL ;
