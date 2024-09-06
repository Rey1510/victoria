package com.example.My_Everything;

import com.example.My_Everything.request.CreateTaskRequest;
import com.example.My_Everything.request.UpdateTaskRequest;
import com.example.My_Everything.response.CreateTaskResponse;
import com.example.My_Everything.response.DeleteResponse;
import com.example.My_Everything.response.GetTaskResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class MyEverythingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

	ArrayList<CreateTaskResponse> tasks = new ArrayList<>();
	long counter=0l;

	//HomePage biar ga kosong
	@GetMapping()
	public String homePage(){
		return "Welcome this is homepage";
	}

	//Cuma buat ngetes keluar ga
	@GetMapping("/tes")
		public List<String> getUser(){
			return List.of("tes ini 1","tes ini 2","tes ini 3");
	}

	@GetMapping("/tasks/{id}")
	public ArrayList<CreateTaskResponse> getTaskByID(
			@PathVariable Long id
	){
//		ArrayList<CreateTaskResponse> tasks = new ArrayList<>();
		ArrayList<CreateTaskResponse> lists = new ArrayList<>();

//		Mock Data buat Cek aja
//		tasks.add(CreateTaskResponse.builder().id(1l).name("Agus").desc("a").status("don").build());
//		tasks.add(CreateTaskResponse.builder().id(2l).name("Ahus").desc("b").status("don").build());
//		tasks.add(CreateTaskResponse.builder().id(3l).name("Aius").desc("c").status("not don").build());

		for(CreateTaskResponse task : tasks){
			if(task.getId() == id){
				lists.add(task);
			}
		}

		return lists;
	}

	@PostMapping("/tasks")
	public ResponseEntity<ArrayList<CreateTaskResponse>> createTask(
			@RequestBody CreateTaskRequest request
	){
//		ArrayList<CreateTaskResponse> tasks = new ArrayList<>();

		//Mock Data lagi
//		tasks.add(CreateTaskResponse.builder().id(1l).name("testes1").desc("hehe").status("apalah").build());
//		tasks.add(CreateTaskResponse.builder().id(2l).name("testes2").desc("hehe").status("apalah").build());
//		tasks.add(CreateTaskResponse.builder().id(3l).name("testes3").desc("hehe").status("apalah").build());

		tasks.add(
				CreateTaskResponse.builder().id(++counter).name(request.getName()).desc(request.getDesc()).status(request.getStatus()).build()
		);

		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

	@PatchMapping("/tasks/{id}")
	public ResponseEntity<ArrayList<CreateTaskResponse>> updateTaskById(
			@PathVariable Long id,
			@RequestBody UpdateTaskRequest request
	){
		for(CreateTaskResponse task : tasks ){
			if(task.getId().equals(id)){
				task.setName(request.getName());
				task.setStatus(request.getStatus());
				task.setDesc(request.getDesc());
			}
		}
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<DeleteResponse>deleteById(
			@PathVariable Long id
	){
		boolean taskRemoved = false;
		for(CreateTaskResponse task : tasks ){
			if(task.getId().equals(id)){
				tasks.remove(task);
				taskRemoved = true;
				break;
			}
		}

		if (taskRemoved) {
			return new ResponseEntity<>(new DeleteResponse("Task deleted successfully.",tasks), HttpStatus.OK);
		}
		return new ResponseEntity<>(new DeleteResponse("Task not found.",tasks), HttpStatus.NOT_FOUND);
	}

	@GetMapping("/tasks")
	public ArrayList<CreateTaskResponse> getAll(
			@RequestParam(name = "page") int page,
			@RequestParam(name = "size") int size
	){
		int start = size * (page - 1);
		ArrayList<CreateTaskResponse> all = new ArrayList<>();

		if (start >= tasks.size()) {
			return all;
		}

		int end = Math.min(start + size, tasks.size());
		all.addAll(tasks.subList(start, end));

		return all;
	}
}
