### Pre-Test: Java Spring Day 3 + SQL Queries

#### **Spring Data JPA and ORM**
1. **What does ORM stand for?**
   - A) Object Relational Model
   - B) Object Relational Mapping
   - C) Object Resource Management
   - D) Object Remote Management

2. **What is the role of JPA in Spring Data JPA?**
   - A) It defines how objects are serialized.
   - B) It provides a specification for ORM in Java.
   - C) It manages the web layer in Spring applications.
   - D) It is responsible for logging in a Spring application.

3. **Which of the following is a popular implementation of JPA?**
   - A) JDBC
   - B) Hibernate
   - C) PostgreSQL
   - D) JSON

4. **True/False: Spring Data JPA allows you to write raw SQL queries.**

#### **Entity Classes and Repositories**
5. **Which annotation is used to mark a class as an entity in JPA?**
   - A) @Table
   - B) @Entity
   - C) @Column
   - D) @Id

6. **What is the purpose of the `@Id` annotation in an entity class?**
   - A) It marks a field as a foreign key.
   - B) It defines the entity’s unique identifier.
   - C) It maps the entity to a table.
   - D) It defines the version of the entity.

7. **True/False: `JpaRepository` extends `CrudRepository` and provides additional methods.**

8. **What is the main function of `CrudRepository`?**
   - A) To handle transactions
   - B) To define entity relationships
   - C) To provide CRUD operations for an entity
   - D) To manage web requests

9. **Which annotation is used to map a one-to-one relationship between two entities?**
   - A) @OneToMany
   - B) @ManyToMany
   - C) @OneToOne
   - D) @JoinColumn

#### **Transactions and ACID Properties**
10. **Which of the following is NOT an ACID property of transactions?**
   - A) Atomicity
   - B) Isolation
   - C) Durability
   - D) Integrity

11. **What does the `@Transactional` annotation in Spring do?**
   - A) Starts a new session
   - B) Manages a set of related operations as a single unit
   - C) Deletes all data in a transaction
   - D) Automatically calls the entity's lifecycle methods

12. **True/False: The propagation level `REQUIRES_NEW` will create a new transaction regardless of the current one.**

13. **Which isolation level ensures that no phantom reads occur?**
   - A) READ_UNCOMMITTED
   - B) READ_COMMITTED
   - C) REPEATABLE_READ
   - D) SERIALIZABLE

#### **Entity Relationships**
14. **Which fetch type loads the related entity immediately?**
   - A) LAZY
   - B) EAGER
   - C) CASCADE
   - D) FETCH

15. **In a One-to-Many relationship, which annotation is used?**
   - A) @OneToMany
   - B) @ManyToOne
   - C) @ManyToMany
   - D) @JoinTable

16. **True/False: Cascade operations allow you to automatically persist or delete related entities.**

#### **JPQL and Native Queries**
17. **JPQL stands for:**
   - A) Java Platform Query Language
   - B) Java Persistent Query Language
   - C) Java Persistence Query Language
   - D) Java Procedural Query Language

18. **Which of the following is true about JPQL?**
   - A) It operates on database tables directly.
   - B) It is database-specific and not portable.
   - C) It operates on entity objects, not tables.
   - D) It cannot be used with native SQL queries.

19. **True/False: Native queries are more portable than JPQL queries.**

20. **Which annotation is used to execute a native SQL query in a Spring Data JPA repository?**
   - A) @Query
   - B) @Table
   - C) @Id
   - D) @NativeQuery

21. **What is the main difference between JPQL and SQL?**
   - A) JPQL is only used for SELECT queries.
   - B) JPQL is object-oriented and operates on entities, while SQL operates on tables.
   - C) JPQL is faster than SQL.
   - D) SQL cannot update records, but JPQL can.

#### **Concurrency and Locking**
22. **Which locking strategy in JPA throws an exception when a version conflict occurs?**
   - A) Optimistic Locking
   - B) Pessimistic Locking
   - C) Versionless Locking
   - D) Auto Locking

23. **What does the `@Version` annotation in JPA indicate?**
   - A) It defines the database version.
   - B) It is used for automatic auditing of entities.
   - C) It is used to handle optimistic locking in concurrency.
   - D) It defines the locking mode.

#### **Pagination and Sorting**
24. **Which interface is used to implement pagination in Spring Data JPA?**
   - A) Pageable
   - B) Sortable
   - C) CrudRepository
   - D) @Paginate

25. **True/False: The `Pageable` interface allows you to retrieve a specific subset of records.**

#### **SQL Queries**
26. **What SQL keyword is used to select unique values from a column?**
   - A) UNIQUE
   - B) DISTINCT
   - C) SELECT
   - D) UNIQUE_VALUES

27. **Which SQL statement is used to update records in a table?**
   - A) MODIFY
   - B) CHANGE
   - C) UPDATE
   - D) ALTER

28. **Write an SQL query to select all records from a table called `books`.**

29. **What SQL keyword is used to retrieve data from more than one table based on a related column?**
   - A) UNION
   - B) JOIN
   - C) SELECT
   - D) MERGE

30. **Which SQL command is used to delete data from a table but keep the table structure intact?**
   - A) DROP
   - B) DELETE
   - C) TRUNCATE
   - D) REMOVE

---


### Story Question: Library Management System

You are the database administrator for a **Library Management System**. The library stores information in the following tables:

#### **Tables:**

1. **books**
   - `id` (INT, Primary Key)
   - `title` (VARCHAR)
   - `isbn` (VARCHAR)
   - `author_id` (INT, Foreign Key to authors table)
   - `genre_id` (INT, Foreign Key to genres table)
   
2. **authors**
   - `id` (INT, Primary Key)
   - `name` (VARCHAR)

3. **genres**
   - `id` (INT, Primary Key)
   - `name` (VARCHAR)

4. **borrowers**
   - `id` (INT, Primary Key)
   - `name` (VARCHAR)

5. **borrowed_books**
   - `id` (INT, Primary Key)
   - `book_id` (INT, Foreign Key to books table)
   - `borrower_id` (INT, Foreign Key to borrowers table)
   - `borrowed_date` (DATE)
   - `due_date` (DATE)
   - `returned` (BOOLEAN)

### Main Question:
You are asked to provide insights from the library’s database. Solve the following tasks using SQL queries.

---

#### Sub-Questions:

1. **List all books, including their title, author's name, and genre, where the genre is "Mystery" or "Thriller".**
   - **Hint**: You will need to perform multiple joins between the `books`, `authors`, and `genres` tables and filter on specific genres.

2. **Display a list of borrowers who have borrowed more than 5 books in total. Include their name and the count of books borrowed.**
   - **Hint**: Use a `GROUP BY` clause on the `borrowers` table, along with a `HAVING` clause to filter those who borrowed more than 5 books.

3. **For each book, display the title and the number of times it has been borrowed, sorted in descending order by the number of times borrowed.**
   - **Hint**: You’ll need to join the `borrowed_books` and `books` tables and use an aggregate function to count how many times each book has been borrowed.

4. **Find the borrower who has kept a book the longest (i.e., the greatest difference between `borrowed_date` and `due_date`). Display the borrower’s name, the title of the book, and the number of days they kept the book.**
   - **Hint**: Use a calculation (`DATEDIFF()`) between the `due_date` and `borrowed_date`.

5. **Retrieve a list of all books that have never been borrowed. Include the book title and author’s name.**
   - **Hint**: Perform a subquery or a `LEFT JOIN` with `borrowed_books` to find books that are not present in the `borrowed_books` table.

6. **List all authors who have written books in more than 2 different genres. Include the author’s name and the number of genres.**
   - **Hint**: You will need to join the `authors`, `books`, and `genres` tables, and use `GROUP BY` with a `HAVING` clause to filter the results.

7. **For each genre, display the genre name and the average number of days a book in that genre is borrowed before it’s returned (i.e., the difference between `borrowed_date` and `due_date`).**
   - **Hint**: Perform a join between the `books`, `genres`, and `borrowed_books` tables and use `AVG()` on the difference between dates.

8. **Find the top 3 most active borrowers, based on the total number of books borrowed, and list their names and the number of books borrowed.**
   - **Hint**: Use a `GROUP BY` and `ORDER BY` clause and limit the results to 3 rows.

