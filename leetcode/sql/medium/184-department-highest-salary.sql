-- Approach 1: Correlated Subquery - less memory, but recalculates MAX for each employee → slower on large tables.

SELECT
    d.name AS Department,
    e.name AS Employee, 
    e.salary AS Salary
FROM Employee e 
JOIN Department d on e.departmentId = d.id
WHERE e.salary = (
    SELECT MAX(salary) 
    FROM Employee
    Where departmentId = e.departmentId
);


-- Approach 2: GROUP BY - precomputes MAX salary once per department → uses more memory but usually faster on large tables.

SELECT
    d.name AS Department,
    e.name AS Employee, 
    e.salary AS Salary
FROM Employee e 
JOIN Department d on e.departmentId = d.id
WHERE (e.departmentId , e.salary) IN (
    SELECT departmentId , MAX(salary)
    FROM Employee
    GROUP BY departmentId
);    
