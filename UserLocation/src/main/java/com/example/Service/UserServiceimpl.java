package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.AdminException;
import com.example.Repo.UserRepo;
import com.example.model.User_location;
@Service
public class UserServiceimpl implements UserService {
@Autowired
private UserRepo urepo;

	@Override
	public User_location adddata(User_location user)  {
		// TODO Auto-generated method stub
		User_location us=urepo.save(user);
		return us;
		
	}

	@Override
	public User_location deletedata(Integer userid) {
		Optional<User_location> user=urepo.findById(userid);
		if(user.isPresent()) {
			User_location datataken=user.get();
			urepo.delete(datataken);
			return datataken;
		}
		else {
			return null;
		}
	}

	@Override
	public User_location patchdata(Integer userid) {
		Optional<User_location> olddata=urepo.findById(userid);
		if(olddata.isPresent()) {
			User_location dataupdated=olddata.get();
			urepo.save(dataupdated);
			return dataupdated;
		}
		else {
			return null;
		}
	}

}
