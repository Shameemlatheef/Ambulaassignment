package com.example.Service;

import com.example.Exception.AdminException;
import com.example.model.User_location;

public interface UserService {
	
	/* this interface is use to write and use 100% abstraction the business logic but the logic is only 
	 * seen by the developer as this is extending the class there wille b the complete busineess logic*/

	
	public User_location adddata(User_location user);
    public User_location deletedata(Integer userid);
     public User_location patchdata(Integer userid);
}
