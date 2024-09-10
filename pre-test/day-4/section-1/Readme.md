### Pre-Test Questions

#### Multiple Choice (First 10 Questions)

1. **What is the main purpose of Spring Security in a Spring Boot application?**
   - A) Handle database operations
   - B) Secure the application against common security threats
   - C) Improve application performance
   - D) Manage application logs
   - E) Enable real-time data processing

2. **Explain the difference between Authentication and Authorization.**
   - A) Authentication verifies identity, Authorization grants access to resources
   - B) Authentication grants access to resources, Authorization verifies identity
   - C) Both perform the same function
   - D) Authentication is optional, Authorization is mandatory
   - E) Authorization comes before Authentication

3. **What are some common web security vulnerabilities that Spring Security helps mitigate?**
   - A) Caching issues
   - B) SQL Injection, XSS, CSRF
   - C) File upload limitations
   - D) Memory leaks
   - E) Slow database queries

4. **How does SQL Injection work, and how can it be prevented?**
   - A) Injects code into SQL queries, prevent by using ORM tools like JPA
   - B) Causes network failures, prevent by using VPN
   - C) Changes HTTP headers, prevent by using HTTPS
   - D) Spoofs IP addresses, prevent by blocking unknown IPs
   - E) Modifies front-end JavaScript code, prevent by using stricter HTML validation

5. **What is Cross-Site Request Forgery (CSRF), and how does Spring Security protect against it?**
   - A) An attack where malicious scripts are injected into websites
   - B) An attack that tricks users into performing actions on a site they are logged into
   - C) A database hijacking attack
   - D) A memory-based attack on session data
   - E) An encryption vulnerability in HTTPS

6. **What is Basic Authentication, and how does it differ from other authentication mechanisms?**
   - A) Uses username and password in HTTP headers for every request
   - B) Encrypts session data with complex algorithms
   - C) Stores authentication tokens in local storage
   - D) Only works with OAuth2
   - E) Requires users to log in once per session only

7. **In Spring Security, what is the purpose of `@PreAuthorize` and `@Secured` annotations?**
   - A) To log HTTP requests
   - B) To enforce role-based permissions
   - C) To validate incoming JSON payloads
   - D) To handle database transactions
   - E) To control application caching

8. **What is Role-Based Access Control (RBAC), and how is it implemented in Spring Security?**
   - A) Grants access based on the user’s session data
   - B) Grants access based on predefined roles and authorities
   - C) Controls access based on IP addresses
   - D) Allows all users to access all resources
   - E) Tracks user login activity for auditing purposes

9. **Describe the structure of a JWT (JSON Web Token). What are its three main components?**
   - A) Header, Payload, Signature
   - B) User, Password, Token
   - C) Request, Response, Token
   - D) Role, Permission, Token
   - E) Session, Cookie, Encryption

10. **How does JWT provide stateless authentication in a Spring Boot application?**
   - A) By encrypting session data on the server
   - B) By storing user sessions in the database
   - C) By issuing self-contained tokens that include claims
   - D) By validating the user's session on every request
   - E) By managing session data in cookies

#### Open-Ended (Next 10 Questions)

11. **Explain how token expiration and refresh tokens work in JWT-based authentication.**

12. **What is the importance of password encryption, and how is BCrypt used in Spring Security?**

13. **Describe how to implement OAuth2 login in a Spring Boot application.**

14. **What is the role of an OAuth2 authorization server in a Spring Boot application?**

15. **Explain the concept of CORS (Cross-Origin Resource Sharing) and its significance.**

16. **How can you configure CORS in a Spring Boot application using Spring Security?**

17. **What is a session fixation attack, and how does Spring Security protect against it?**

18. **What is the difference between stateful and stateless session management in Spring Security?**

19. **What are some common security pitfalls in web applications, and how can they be avoided?**

20. **Why is it important to conduct regular security audits, and what tools can help?**

