package com.example.cnExpense.DAL;

import com.example.cnExpense.entities.*;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDalImpl implements UserDal {

    @Autowired
    EntityManager entityManager;

    @Override
    public User getUserById(Integer id) {
        // Complete the implementation   
    	Session session = entityManager.unwrap(Session.class);
    	User user = session.get(User.class, id);
    	return user;
    }

    @Override
    public List<User> getAllUsers() {
        // Complete the implementation
    	Session session = entityManager.unwrap(Session.class);
    	List<User>user = session.createQuery("SELECT u FROM User u",User.class).getResultList();
    	return user;
    }

    @Override
    public boolean checkUserExist(User user){
        boolean userExist=false;
        for (User everyUser: getAllUsers()) {
            if (everyUser.getUsername().equalsIgnoreCase(user.getUsername())) {
                userExist = true;
            }
        }
        return userExist;
    }

    @Override
    public User findUser(User newUser) {
        Session session = entityManager.unwrap(Session.class);
        for(User user:getAllUsers())
        {
            if(user.getUsername()!=null && user.getUsername().equalsIgnoreCase(newUser.getUsername()))
            {
                return user;
            }
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        // Complete the implementation
    	Session session = entityManager.unwrap(Session.class);
    	Integer userId = (Integer)session.save(user);
    	return session.get(User.class, userId);
    }
}


