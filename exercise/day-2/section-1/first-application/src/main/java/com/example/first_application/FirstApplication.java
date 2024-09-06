package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping()
	public String sayHello(){
		return "Hello World!";
	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("Jon","Jane","Jack");
	}

	@GetMapping("/users/list")
	public ArrayList<GetAssetResponse> listAll(){

		ArrayList<GetAssetResponse> list = new ArrayList<>();
		var response = GetAssetResponse.builder().id(1l).fullName("Jon").age(20).address("Jalanin Aja").build();
		var response1 = GetAssetResponse.builder().id(2l).fullName(("Anton")).age(19).address("Jalan Serta Yesus").build();

		list.add(response);
		list.add(response1);
		response.getFullName();
		return list;
	}
//		response.setFullName("Testestes");

	@GetMapping("/users/{id}")
	public ArrayList<GetAssetResponse> getAssetbyId(
			@PathVariable Long id
	){
		ArrayList<GetAssetResponse> asset = new ArrayList<>();

		asset.add(GetAssetResponse.builder().id(1l).fullName("Anton").build());
		asset.add(GetAssetResponse.builder().id(2l).fullName("Anton2").build());
		asset.add(GetAssetResponse.builder().id(3l).fullName("Anton3").build());
		asset.add(GetAssetResponse.builder().id(4l).fullName("Anton4").build());
		asset.add(GetAssetResponse.builder().id(8l).fullName("Anton5").build());

//		for (int i = 0; i < asset.size(); i++) {
//			if(asset.get(i).getId().equals(id)){
//				return asset.get(i);
//			}
//		}
		ArrayList<GetAssetResponse> all = new ArrayList<>();
		for(GetAssetResponse as : asset){
//			if(as.getId().equals(id)){
//				return as;
//			}
			if(as.getId() >= id){
				all.add(as);
			}
		}
		return all;

//		return GetAssetResponse.builder().id(id).fullName("Jontor").build();
	}

//	@GetMapping("/users/{id}")
//	public ResponseEntity<Long> getUserById(Long id){
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}

}
