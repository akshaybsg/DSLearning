--https://www.w3resource.com/sql-exercises/employee-database-exercise/sql-subqueries-exercise-employee-database-33.php
-- This SQL query aims to list the highest-paid employees in each department by using a correlated subquery to find the maximum salary for each department.
-- SELECT statement begins

--Employee Table
-- Id
-- Name
-- Salary
-- Department id

--Find one employee from each department who is getting the highest salary within his department.


SELECT
    e.emp_name, -- Selects the employee name
    e.dep_id -- Selects the department ID
FROM
    employees e -- Specifies the 'employees' table with alias 'e' to retrieve data from
WHERE
    e.salary = ( -- Filters the employees based on the condition that their salary equals the maximum salary for their department
        SELECT
            MAX(salary) -- Finds the maximum salary for each department using a subquery
        FROM
            employees e2 -- Specifies a correlated subquery by referencing the 'employees' table again with alias 'e2'
        WHERE
            e2.dep_id = e.dep_id -- Correlates the subquery with the main query by comparing the department IDs
    );