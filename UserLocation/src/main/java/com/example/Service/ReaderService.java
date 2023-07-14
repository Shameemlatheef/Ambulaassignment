package com.example.Service;

import java.util.List;

import com.example.model.User_location;

public interface ReaderService {

	
	/* this interface is use to write and use 100% abstraction the business logic but the logic is only seen by the developer as this is extending the class there wille b the complete busineess logic*/
	public List<User_location> findingnearestlocations();
}
