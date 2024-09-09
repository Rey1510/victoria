-- Insert departments (manually created for simplicity)
INSERT INTO departments (name, manager_id) VALUES 
('HR', 1), 
('IT', 2), 
('Finance', 3), 
('Marketing', 4), 
('Sales', 5);

-- Generate 1000 random employees
DO $$ 
DECLARE 
    i INT; 
    dept_count INT := 5;
BEGIN 
    FOR i IN 1..1000 LOOP
        INSERT INTO employees (first_name, last_name, department_id, hire_date) 
        VALUES (
            'Employee_' || i, 
            'LastName_' || i, 
            floor(random() * dept_count + 1), 
            (CURRENT_DATE - (floor(random() * 365 * 5))::int)
        );
        
        -- Insert salary for each employee
        INSERT INTO salaries (employee_id, salary, effective_date) 
        VALUES (
            i, 
            40000 + (random() * 60000), 
            (CURRENT_DATE - (floor(random() * 365 * 5))::int)
        );
        
        -- Randomly assign promotions to some employees
        IF random() > 0.7 THEN
            INSERT INTO promotions (employee_id, promotion_date, new_salary) 
            VALUES (
                i, 
                (CURRENT_DATE - (floor(random() * 365))::int), 
                45000 + (random() * 70000)
            );
        END IF;
    END LOOP;
END $$;
