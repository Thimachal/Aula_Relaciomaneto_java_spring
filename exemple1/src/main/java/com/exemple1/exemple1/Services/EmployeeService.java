package com.exemple1.exemple1.Services;

import com.exemple1.exemple1.Models.Employee;
import com.exemple1.exemple1.Models.EmployeeDTO;
import com.exemple1.exemple1.Models.Post;
import com.exemple1.exemple1.Repositories.EmployeeRepository;
import com.exemple1.exemple1.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository actionEmployeeRepository;

    @Autowired PostRepository actionPostRepository;

    public ResponseEntity<?> registerService(EmployeeDTO employeeFromFront) {
        try {
            Employee employee = new Employee();
            Post post = actionPostRepository.findById(employeeFromFront.getPostIdDTO()).orElseThrow();

            employee.setEmployeeId(employeeFromFront.getEmployeeIDDTO());
            employee.setEmployeeName(employeeFromFront.getEmployeeNameDTO());
            employee.setPost(post);

            actionEmployeeRepository.save(employee);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<?> employeeAll(){
        return ResponseEntity.ok(actionEmployeeRepository.findAll());
    }


}

//objeto generico que faz um D PARA
//aula reflection
//classe builder
//record mapper
