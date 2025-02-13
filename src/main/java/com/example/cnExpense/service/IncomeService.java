package com.example.cnExpense.service;

import com.example.cnExpense.DAL.IncomeDal;
import com.example.cnExpense.ExceptionHandling.NotFoundException;
import com.example.cnExpense.entities.Income;
import com.example.cnExpense.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IncomeService {
    @Autowired
    private IncomeDal incomeDal;

    @Transactional
    public Income getIncomeById(Integer incomeid) {
        // Complete the implementation
    	Income income  =  incomeDal.getIncomeById(incomeid);
    	if(income==null) {
    		throw new NotFoundException("Not Exist");
    	}
    	return income;
    }

    @Transactional
    public Income saveIncome(User user,Income income) {
        // Complete the implementation
    	Income inc =  incomeDal.saveIncome(user,income);
    	if(inc==null) {
    		throw new NotFoundException("Not Exist");
    	}
    	return inc;
    	
    }
}