package com.exemple1.exemple1.Services;

import com.exemple1.exemple1.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository actionEmployeeRepository;
    public ResponseEntity<?> employeeAll(){
        return ResponseEntity.ok(actionEmployeeRepository.findAll());
    }

}
