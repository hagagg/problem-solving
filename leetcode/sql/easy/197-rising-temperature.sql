-- Approach 1: Subquery - uses less memory, but may be slower since the subquery executes per row.

SELECT id 
FROM Weather w1
WHERE temperature > (
    SELECT w2.temperature
    FROM Weather w2
    WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1
);


-- Approach 2: Self Join - -- Uses more memory, but usually faster and more efficient on larger datasets.

SELECT w1.id 
FROM Weather w1
JOIN Weather w2 ON DATEDIFF (w1.recordDate , w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;
