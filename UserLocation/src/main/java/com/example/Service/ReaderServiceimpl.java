package com.example.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.UserRepo;
import com.example.model.User_location;
@Service
public class ReaderServiceimpl implements ReaderService {
@Autowired
private UserRepo urepo;
	@Override
	public List<User_location> findingnearestlocations() {
		// TODO Auto-generated method stub

		List<User_location> locations=(List<User_location>) urepo.findAll();
		if(locations.size()==0) {
			return null;
		}
		else {
			Collections.sort(locations);
			List<User_location> list=new ArrayList();
			for(int i=0;i<5;i++) {
				list.add(locations.get(i));
				
			}
			return list;
		}
		
		
	}

}
