package com.example.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User_location;
@Repository
public interface UserRepo extends CrudRepository<User_location, Integer>{
/* this interface extends crud repository have contains many inbuilt functions like save delete update*/
}
