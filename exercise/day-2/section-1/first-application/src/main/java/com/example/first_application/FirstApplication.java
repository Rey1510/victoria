package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping
	public ArrayList<GetAssetResponse> sayHello(){

		ArrayList<GetAssetResponse> list = new ArrayList<>();
		var response = GetAssetResponse.builder().id(10l).fullName("Jon").age(20).address("Jalanin Aja").build();
		var response1 = GetAssetResponse.builder().id(11l).fullName(("Anton")).age(19).address("Jalan Serta Yesus").build();

		list.add(response);
		list.add(response1);
		response.getFullName();
		return list;
	}
//		response.setFullName("Testestes");

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("Jon","Jane","Jack");
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<Long> getUserById(Long id){
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
