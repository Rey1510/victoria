### Full Process Summary

- **Step 1**: Ensure your `docker-compose.yml` is not mounting the SQL files so they don’t auto-run.
  
- **Step 2**: Start the container:
  ```bash
  docker-compose up -d
  ```

- **Step 3**: Copy the SQL files into the running container:
  ```bash
  docker cp init.sql employee_db:/init.sql
  docker cp seed.sql employee_db:/seed.sql
  ```

- **Step 4**: Access the container and run the SQL scripts:
  ```bash
  docker exec -it employee_db bash
  psql -U admin -d employee_management
  \i /init.sql;
  \i /seed.sql;
  ```

This method allows you to manually control when and how the SQL scripts are executed inside the running Docker container, and it also enables you to modify or test the scripts before running them.


## test

### **Instructions:**
1. Ensure the database is properly set up and populated with data.
2. Write SQL queries for each of the questions below.
3. Use joins, subqueries, aggregate functions, and filtering as necessary to retrieve the correct data.

### **15 SQL-Based Questions **

1. **List all employees who work in the "IT" department, including their full name, hire date, and salary.**
   - **Hint**: Join the `employees`, `departments`, and `salaries` tables.

2. **Retrieve the top 5 employees with the highest salaries. Include their full name, salary, and department.**
   - **Hint**: Join the `employees`, `departments`, and `salaries` tables, then order the results by salary.

3. **Find employees who have worked at the company for more than 3 years and have received at least one promotion.**
   - **Hint**: Use `DATEDIFF()` or similar functions to calculate employment duration and join the `promotions` table.

4. **Display the total number of employees in each department.**
   - **Hint**: Group the results by department.

5. **Find employees who have never received a promotion.**
   - **Hint**: Perform a `LEFT JOIN` between `employees` and `promotions` and filter for employees without promotions.

6. **Retrieve the average salary for each department.**
   - **Hint**: Use `AVG()` to calculate the average salary and group by department.

7. **Find the employee who has been with the company the longest. Include their full name, hire date, and department.**
   - **Hint**: Use `MIN()` or ordering based on hire date.

8. **List the number of employees who have received promotions in the last year (within 365 days).**
   - **Hint**: Filter the `promotions` table using `promotion_date`.

9. **Display the highest and lowest salary for each department.**
   - **Hint**: Use `MAX()` and `MIN()` functions and group by department.

10. **Find all employees who earn more than the average salary of their department. Include their full name, salary, and department.**
    - **Hint**: Use subqueries or `JOIN` to compare employee salaries with the department's average salary.

11. **List the departments and the total salary paid to all employees in each department.**
    - **Hint**: Use `SUM()` to calculate total salaries and group by department.

12. **Retrieve a list of employees who were promoted more than once.**
    - **Hint**: Use `GROUP BY` and `HAVING COUNT()` on the `promotions` table.

13. **Find the employees whose current salary is at least 20% higher than their initial salary.**
    - **Hint**: Use `JOIN` on the `salaries` and `promotions` tables and calculate the percentage difference.

14. **List all employees who were hired in the same year as their department manager.**
    - **Hint**: Use a self-join between the `employees` and `departments` tables.

15. **Retrieve the department with the highest average salary and the department with the lowest average salary.**
    - **Hint**: Use `AVG()` and sorting or filtering to find the highest and lowest averages.

