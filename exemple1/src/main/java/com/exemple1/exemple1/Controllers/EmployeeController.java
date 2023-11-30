package com.exemple1.exemple1.Controllers;

import com.exemple1.exemple1.Models.Employee;
import com.exemple1.exemple1.Models.EmployeeDTO;
import com.exemple1.exemple1.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService actionEmployeeService;

    @GetMapping("/")
    public ResponseEntity<?> allEmployees() {
        try {
            return new ResponseEntity<>(actionEmployeeService.employeeAll().getBody(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/")
    public ResponseEntity<?> registerEmployees(@RequestBody EmployeeDTO employeeFromFront){
        try{
            ResponseEntity<?> employeeFromService = actionEmployeeService.registerService(employeeFromFront);
            return new ResponseEntity<>(employeeFromService.getBody(),HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
