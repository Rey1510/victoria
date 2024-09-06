package com.example.first_application;

import com.example.first_application.request.CreateUserRequest;
import com.example.first_application.request.CreateUserResponse;
import com.example.first_application.request.EmployeeUserRequest;
import com.example.first_application.response.EmployeeUserResponse;
import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/calc/add")
	public String getAdd(
			@RequestParam(name= "panjang") int panjang,
			@RequestParam(name= "lebar",required = false,defaultValue = "20D") int lebar
	){
		return String.valueOf(panjang + lebar);
	}

//	@GetMapping("/users/{id}")
//	public ResponseEntity<Long> getUserById(Long id){
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}

	@GetMapping("/page")
	public ArrayList<GetAssetResponse> getAssetByPage(
			@RequestParam(name = "size") int size,
			@RequestParam(name = "page") int page
	){
		ArrayList<GetAssetResponse> asset = new ArrayList<>();

		asset.add(GetAssetResponse.builder().id(1l).fullName("Anton").build());
		asset.add(GetAssetResponse.builder().id(2l).fullName("Anton2").build());
		asset.add(GetAssetResponse.builder().id(3l).fullName("Anton3").build());
		asset.add(GetAssetResponse.builder().id(4l).fullName("Anton4").build());
		asset.add(GetAssetResponse.builder().id(5l).fullName("Anton5").build());
		asset.add(GetAssetResponse.builder().id(6l).fullName("Anton").build());
		asset.add(GetAssetResponse.builder().id(7l).fullName("Anton2").build());
		asset.add(GetAssetResponse.builder().id(8l).fullName("Anton3").build());
		asset.add(GetAssetResponse.builder().id(9l).fullName("Anton4").build());
		asset.add(GetAssetResponse.builder().id(10l).fullName("Anton5").build());

//		for (int i = 0; i < asset.size(); i++) {
//			if(asset.get(i).getId().equals(id)){
//				return asset.get(i);
//			}
//		}

		int start = size * (page-1);

		ArrayList<GetAssetResponse> all = new ArrayList<>();

		if(asset.size() - 1 < start){
			return all;
		}

		for (int i = start; i < start + size; i++) {
			all.add(asset.get(i));
			if (asset.size() - 1 < i + 1) {
				break;
			}
		}
		return all;
	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request) {

		List<CreateUserResponse> users = new ArrayList<>();

		users.add(CreateUserResponse.builder().id(1l).fullName("ab").build());
		users.add(CreateUserResponse.builder().id(2l).fullName("cd").build());

		users.add(
				CreateUserResponse.builder().id(request.getId()).fullName(request.getFullName()).age(request.getAge()).address(request.getAddress()).build()
		);

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/employee")
	public ResponseEntity<ArrayList<EmployeeUserResponse>> createEmployee(
			@RequestBody EmployeeUserRequest request
	){
		ArrayList<EmployeeUserResponse> employee = new ArrayList<>();

		employee.add(EmployeeUserResponse.builder().id(1l).name("tes1").age(12).address(null).phone("081xxx").build());
		employee.add(EmployeeUserResponse.builder().id(2l).name("tes2").age(12).address("Indonesia").phone("082xxx").build());

		if(request.getName() != null && request.getAge()!=null && request.getPhone() != null){
			employee.add(
					EmployeeUserResponse.builder().id(employee.size()+1l).name(request.getName()).age(request.getAge()).address(request.getAddress()).phone(request.getPhone()).build()
			);
		}


		return new ResponseEntity<>(employee,HttpStatus.OK);
	}

}
