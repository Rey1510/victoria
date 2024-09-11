package com.example.auth_application.config;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;



public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final String secretKey = "4be1edd7388aafd5a4bdd03041a8347ea184e17987e87aaa792f6d7b71ba01a7";


    @Override
    protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain) throws jakarta.servlet.ServletException, IOException {
        // Get the Authorization header
        String header = request.getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7); // Extract the token

            try {
                // Parse the JWT token
                Claims claims = Jwts.parserBuilder()
                        .setSigningKey(secretKey.getBytes()) // Use your secret key here
                        .build()
                        .parseClaimsJws(token)
                        .getBody();

                String username = claims.getSubject(); // Extract the username (subject) from the token
                String id = claims.get("id", String.class); // Extract the id from the claims

                // If the username is valid, set it in the security context
                if (username != null && id != null) {
                    // Here, you can include the ID in the authentication object
                    UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
                            username, null, Collections.emptyList());
                    // You can attach the id in the principal or as a custom object, for example, UserDetails
                    auth.setDetails(id);  // Optionally, store the id as details
                    SecurityContextHolder.getContext().setAuthentication(auth);
                }
            } catch (Exception e) {
                // Handle invalid or expired JWT token
                System.out.println("Invalid or expired token: " + e.getMessage());
            }
        }

        // Proceed with the rest of the filter chain
        filterChain.doFilter(request, response);
    }
}