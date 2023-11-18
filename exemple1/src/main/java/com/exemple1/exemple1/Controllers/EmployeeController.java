package com.exemple1.exemple1.Controllers;

import com.exemple1.exemple1.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService actionEmployeeService;

    @GetMapping("/")
    public ResponseEntity<?> allEmployees() {
        try {
            return new ResponseEntity<>(actionEmployeeService.emplyeeAll.getB)
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
