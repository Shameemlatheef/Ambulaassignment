package com.example.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ReaderService;
import com.example.model.User_location;

@RestController
@RequestMapping(value = "/Reader")
public class ReaderContoller {
	@Autowired 
	private ReaderService rservice;
	/* autowiring helps in dependency inspring boot.we have the dependecy of repo here*/
	
	@GetMapping("/getdata")
	public ResponseEntity<List<User_location>> viewAll() {
		
		
		
		List<User_location> list=rservice.findingnearestlocations();
		
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	/*responseEntity return the data to controller and send the data*/
	
	
}
