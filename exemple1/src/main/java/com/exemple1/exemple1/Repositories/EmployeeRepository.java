package com.exemple1.exemple1.Repositories;

import com.exemple1.exemple1.Models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
