package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.AdminException;
import com.example.Service.UserService;
import com.example.model.User_location;

@RestController
@RequestMapping(value = "/Admin")
public class AdminController {

	@Autowired
	private UserService userv;
	
	/* autowiring helps in dependency inspring boot.we have the dependecy of repo here*/
	
	/*responseEntity return the data to controller and send the data*/
	
	
	@PostMapping("/data")
	ResponseEntity<User_location> datasave(@RequestBody User_location user){
		User_location userdata=userv.adddata(user);
		
		return new ResponseEntity<User_location>(userdata,HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/delete_data")
	public ResponseEntity<User_location> removeProduct(@RequestParam Integer userid){
		
		User_location deletedata=userv.deletedata(userid);
		return new ResponseEntity<User_location>(deletedata, HttpStatus.OK);
	}
	
	@PatchMapping("/Update_data")
public ResponseEntity<User_location> updateProduct(@RequestParam Integer userid) {
		
		User_location updated=userv.patchdata(userid);
		return new ResponseEntity<User_location>(updated, HttpStatus.OK);
	}
}
