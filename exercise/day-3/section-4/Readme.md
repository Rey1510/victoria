### Hackathon Case: **Book Management System**

### Objective:
Participants will create a RESTful API using **Spring Boot** and **JPA** to manage a simple book catalog. The system will allow users to create, read, update, and delete books, authors, and genres.

---

### Story:
You are tasked with creating a basic API for a **Book Management System** where users can manage their book collection. The system should allow users to manage books, authors, and genres, perform basic CRUD operations, and implement some filtering and searching functionality.

### Tasks:

1. **Project Setup**:
   - Create a Spring Boot application using **Spring Initializr**.
   - Add dependencies: Spring Web, Spring Data JPA, and an embedded H2 or PostgreSQL database.

2. **Create the Database Schema**:
   - Define the following entities:
     - **Book**: `id`, `title`, `isbn`, `author`, `genre`, `publishedDate`
     - **Author**: `id`, `name`, `bio`
     - **Genre**: `id`, `name`
   - Each book should be linked to one **Author** and one **Genre** (Many-to-One relationships).

### Endpoints:

#### 1. **Books API**:
   - `POST /api/books`: Create a new book.
   - `GET /api/books`: Retrieve a list of all books.
   - `GET /api/books/{id}`: Get details of a specific book by `id`.
   - `PUT /api/books/{id}`: Update an existing book.
   - `DELETE /api/books/{id}`: Delete a book by `id`.
   - `GET /api/books/search`: Search books by **title**, **author name**, or **genre** (using query parameters like `?title=`, `?author=`, or `?genre=`).

#### 2. **Authors API**:
   - `POST /api/authors`: Create a new author.
   - `GET /api/authors`: Retrieve a list of all authors.
   - `GET /api/authors/{id}`: Get details of a specific author.
   - `PUT /api/authors/{id}`: Update an author.
   - `DELETE /api/authors/{id}`: Delete an author.

#### 3. **Genres API**:
   - `POST /api/genres`: Create a new genre.
   - `GET /api/genres`: Retrieve a list of all genres.
   - `GET /api/genres/{id}`: Get details of a specific genre.
   - `PUT /api/genres/{id}`: Update a genre.
   - `DELETE /api/genres/{id}`: Delete a genre.

### Requirements:

1. **Entities**:
   - Create the `Book`, `Author`, and `Genre` entities using JPA annotations.
   - Each book must have one author and one genre.
   - Authors can be associated with many books, and genres can also be linked to many books.

2. **Repositories**:
   - Create repositories for `Book`, `Author`, and `Genre` using Spring Data JPA (`CrudRepository` or `JpaRepository`).
   
3. **Services**:
   - Implement a service layer to handle the business logic.
   
4. **Controllers**:
   - Create REST controllers to expose the API endpoints.

5. **Validation**:
   - Use **Java Bean Validation** annotations (like `@NotNull`, `@Size`, etc.) to validate the inputs when creating or updating books, authors, or genres.

6. **Database**:
   - Use **H2** in-memory database (or PostgreSQL) for testing and development.
   - Ensure the database schema is automatically created from the JPA entities.
   - Add initial seed data for authors and genres when the application starts.

---

### Bonus Challenges (Optional):

1. **Pagination and Sorting**:
   - Add pagination and sorting for the `GET /api/books` endpoint using Spring’s `Pageable` interface.

