package com.example.cnExpense.controllers;

import com.example.cnExpense.entities.Income;
import com.example.cnExpense.entities.User;
import com.example.cnExpense.service.IncomeService;
import com.example.cnExpense.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/incomes")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;
    
    @Autowired
    private UserService userService;

    @GetMapping("/{incomeid}")
    public Income getIncomeById(@PathVariable Integer incomeid) {
        // Complete the implementation
    	return incomeService.getIncomeById(incomeid);
    }

    @PostMapping("/save/{userId}")
    public Income saveIncome(@PathVariable Integer userId, @RequestBody Income income) {
        // Complete the implementation
    	User user = userService.getUserById(userId);
         return incomeService.saveIncome(user, income);
    }
}
