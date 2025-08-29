-- Approach 1: Subquery (less memory, but can be slower on large tables since subquery runs per row)

SELECT name AS Employee
FROM Employee e 
WHERE salary > (
   SELECT salary
   FROM Employee 
   Where id = e.managerId 
);


-- Approach 2: Self Join (uses more memory for join, but usually faster and more efficient on large datasets)

SELECT e1.name AS Employee
FROM Employee e1
Join Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;
