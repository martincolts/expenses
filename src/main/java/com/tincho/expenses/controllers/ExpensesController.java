package com.tincho.expenses.controllers;


import com.tincho.expenses.DTOs.ExpenseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @GetMapping
    public @ResponseBody
    ExpenseDTO getExpense(){
        ExpenseDTO expenseDTO = new ExpenseDTO();
        expenseDTO.setDescription("example");
        expenseDTO.setValue(new Double(3.6));
        return expenseDTO;
    }
}
