-- Approach 1: Using MAX() with a subquery
-- Returns NULL if not found
-- Performance: more efficient for large tables - minimal memory usage

SELECT 
    (SELECT MAX(salary)
    FROM Employee
    Where salary < (SElECT MAX(salary) FROM Employee)
    ) AS SecondHighestSalary;   


-- Approach 2: Using DISTINCT + ORDER BY + LIMIT/OFFSET
-- Returns empty if not found.
-- Performance: less efficient on large tables due to sorting all distinct salaries - higher memory usage than Approach 1.

SELECT DISTINCT salary AS SecondHighestSalary
FROM Employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1;
