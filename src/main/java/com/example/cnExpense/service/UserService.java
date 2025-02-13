package com.example.cnExpense.service;

import com.example.cnExpense.DAL.UserDal;
import com.example.cnExpense.ExceptionHandling.NotFoundException;
import com.example.cnExpense.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDal userDal;

    @Transactional
    public User getUserById(Integer id){
        // Complete the implementation
    	User user  = userDal.getUserById(id);
    	if(user==null) {
    		throw new NotFoundException("User with ID " + id + " not found.");
    	}
    	return user;
    }

    @Transactional
    public List<User> getAllUsers() {
        // Complete the implementation
    	List<User> users = userDal.getAllUsers();
    	if (users.isEmpty()) {
    	    throw new NotFoundException("No users found.");
    	}
    	return users;

    }

    @Transactional
    public boolean checkUserExist(User user) {
        return userDal.checkUserExist(user);
    }

    @Transactional
    public User findUser(User newUser){
        return userDal.findUser(newUser);
    }

    @Transactional
    public User saveUser(User user) {
        // Complete the implementation
    	
    	return userDal.saveUser(user);
    }
}