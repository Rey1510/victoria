### **Pre-test Instructions**

1. **Create a text file named `your-name-npk.txt`.**
   - Replace "your-name" with your actual name. For example, if your name is John Doe, the file should be named `John-Doe-10001.txt`.
   
2. **Answer all the questions in this file.**
   - There are 30 questions in total: 10 multiple choice, 5 true/false, and 15 essay questions.
   - Clearly label each section (Multiple Choice, True/False, Essay) and provide your answers under each section.
   - For multiple choice questions, write the question number followed by the letter corresponding to the correct answer (e.g., 1. b).
   - For true/false questions, simply write the question number followed by "True" or "False" (e.g., 1. True).
   - For essay questions, write the question number followed by your written answer. There’s no specific word limit for the essay questions, but aim to provide clear and concise answers.

---

### **Submission**

1. **Save your file** with the name `your-name-npk.txt`.
   - For example, if your name is John Doe, save the file as `John-Doe-10001.txt`.

2. **Push the file to your Git repository**:
   - If your repository is already set up:
     1. Add the file: `git add your-name-npk.txt`
     2. Commit the file: `git commit -m "Pre-test submission by [your name]"`
     3. Push the file: `git push origin main` (or the appropriate branch you're working on)
   
   - If your repository is not yet set up, initialize a new Git repository:
     1. Run: `git init`
     2. Add your remote repository: `git remote add origin <your-repository-URL>`
     3. Add the file: `git add your-name.txt`
     4. Commit the file: `git commit -m "Pre-test submission by [your name]"`
     5. Push the file: `git push -u origin main`

---

### **Multiple Choice Questions (10 Questions)**

1. **What does the `@RestController` annotation in Spring Boot do?**
   - a) Marks the class as a service component.
   - b) Combines `@Controller` and `@ResponseBody` to simplify REST API creation.
   - c) Maps HTTP requests to methods.
   - d) Manages dependency injection.

2. **Which HTTP method is used to retrieve data from a RESTful web service?**
   - a) POST
   - b) GET
   - c) PUT
   - d) DELETE

3. **Which annotation is used to bind a method parameter to a path variable in Spring Boot?**
   - a) `@RequestParam`
   - b) `@PathVariable`
   - c) `@RequestBody`
   - d) `@ResponseBody`

4. **What is the status code for "Resource Created" in REST APIs?**
   - a) 200
   - b) 201
   - c) 404
   - d) 500

5. **Which HTTP method should be used to update an existing resource in a RESTful service?**
   - a) GET
   - b) POST
   - c) PUT
   - d) DELETE

6. **Which tool is commonly used to test REST API endpoints?**
   - a) Jenkins
   - b) Postman
   - c) Gradle
   - d) Maven

7. **Which annotation is used to handle HTTP POST requests in Spring Boot?**
   - a) `@GetMapping`
   - b) `@PostMapping`
   - c) `@PutMapping`
   - d) `@DeleteMapping`

8. **What does the `@RequestBody` annotation do in a Spring Boot controller?**
   - a) It maps query parameters to method arguments.
   - b) It binds the body of the HTTP request to a method parameter.
   - c) It sets the response body as the return value.
   - d) It handles HTTP headers.

9. **What is the purpose of `@RequestParam` in Spring Boot?**
   - a) To bind query parameters in the request URL.
   - b) To bind path variables in the request URL.
   - c) To handle exceptions in RESTful APIs.
   - d) To serialize JSON responses.

10. **Which of the following is a key feature of RESTful architecture?**
    - a) Statefulness
    - b) Statelessness
    - c) Complex interface
    - d) Protocol-based communication

---

### **True/False Questions (5 Questions)**

1. **The `@RestController` annotation is a combination of `@Controller` and `@Service`.**  
   True / False

2. **The HTTP DELETE method is used to retrieve resources from the server.**  
   True / False

3. **In RESTful services, each request must contain all necessary information for the server to process it.**  
   True / False

4. **Spring Boot automatically handles the serialization of Java objects into XML by default.**  
   True / False

5. **The `@GetMapping` annotation in Spring Boot is used to handle HTTP GET requests.**  
   True / False

---

### **Essay Questions (15 Questions)**

1. Explain the principles of RESTful architecture and how they influence API design.
2. What is the difference between the HTTP methods `GET`, `POST`, `PUT`, and `DELETE` in a REST API?
3. How does Spring Boot simplify the creation of RESTful web services compared to traditional Spring MVC?
4. Discuss the role of `@RequestMapping` in a Spring Boot controller and how it handles different HTTP methods.
5. What is the significance of HTTP status codes in RESTful services? Provide examples of common status codes and their meanings.
6. How do you handle input validation in REST APIs using Spring Boot?
7. Explain how dependency injection and Inversion of Control (IoC) work in the context of a Spring Boot REST API.
8. What is the purpose of the `@RequestBody` and `@ResponseBody` annotations in RESTful web services?
9. How does Spring Boot manage JSON serialization and deserialization, and what library does it use by default?
10. Discuss the importance of exception handling in RESTful APIs and how Spring Boot helps manage global exceptions.
11. What are CORS (Cross-Origin Resource Sharing) issues, and how can you configure CORS in a Spring Boot application?
12. Explain the process of securing a REST API in Spring Boot using Spring Security.
13. Describe the concept of statelessness in REST and why it is important for scalability.
14. How can Postman be used to test the functionality of REST API endpoints?
15. Discuss the difference between integration tests and unit tests when testing RESTful APIs in Spring Boot.

