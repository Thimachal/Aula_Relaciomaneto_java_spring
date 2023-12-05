package com.exemple2.exemple2.Repositories;

import com.exemple2.exemple2.Models.Postage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostageRepository extends CrudRepository<Postage, Long> {
}
