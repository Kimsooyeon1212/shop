package com.shop.repository;

import com.shop.entity.Result;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ResultRepository extends CrudRepository<Result, Long> {

    List<Result> findByName(String name);

    List<Result> findByNameLike(String name);


}
