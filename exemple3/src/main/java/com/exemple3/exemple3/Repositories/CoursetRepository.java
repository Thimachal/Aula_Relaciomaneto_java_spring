package com.exemple3.exemple3.Repositories;

import com.exemple3.exemple3.Models.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursetRepository extends CrudRepository<Courses, Long> {
}
