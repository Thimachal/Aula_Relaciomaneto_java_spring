package com.exemple1.exemple1.Services;

import com.exemple1.exemple1.Models.Employee;
import com.exemple1.exemple1.Models.EmployeeDTO;
import com.exemple1.exemple1.Models.Post;
import com.exemple1.exemple1.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository actionEmployeeRepository;


    public ResponseEntity<?> registerService(EmployeeDTO employeeFromFront) {
        Employee employee = new Employee();
        Post post = new Post();

        employee.setEmployeeId(employeeFromFront.getEmployeeIDDTO());
        employee.setEmployeeName(employeeFromFront.getEmployeeNameDTO());
        post.setPostId(employeeFromFront.getPostIdDTO());

        actionEmployeeRepository.save(employee);


        return ResponseEntity.ok(employee,post);
    }

    public ResponseEntity<?> employeeAll(){
        return ResponseEntity.ok(actionEmployeeRepository.findAll());
    }


}

//objeto generico que faz um D PARA
//aula reflection
//classe builder
//record mapper
