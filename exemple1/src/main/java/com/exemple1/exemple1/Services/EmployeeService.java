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

        employee.setEmployeeId(employeeFromFront.getEmployeeIDDTO());
        employee.setEmployeeName(employeeFromFront.getEmployeeNameDTO());

        Post post = new Post();

        post.setPostId();
        //objeto generico que faz um D PARA
        //aula reflection
        //classe builder
        //record mapper


        actionEmployeeRepository.save(employee, post);

        return ResponseEntity.ok(employee, post);
    }











    public ResponseEntity<?> employeeAll(){
        return ResponseEntity.ok(actionEmployeeRepository.findAll());
    }


}
