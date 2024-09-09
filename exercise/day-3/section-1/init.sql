CREATE TABLE departments (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    manager_id INT
);

CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    department_id INT REFERENCES departments(id),
    hire_date DATE NOT NULL
);

CREATE TABLE salaries (
    id SERIAL PRIMARY KEY,
    employee_id INT REFERENCES employees(id),
    salary DECIMAL(10, 2) NOT NULL,
    effective_date DATE NOT NULL
);

CREATE TABLE promotions (
    id SERIAL PRIMARY KEY,
    employee_id INT REFERENCES employees(id),
    promotion_date DATE NOT NULL,
    new_salary DECIMAL(10, 2) NOT NULL
);
