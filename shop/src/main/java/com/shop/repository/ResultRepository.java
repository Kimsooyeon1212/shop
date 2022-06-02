package com.shop.repository;

import com.shop.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ResultRepository extends JpaRepository<Result, String> {

    List<Result> findByName(String name);

}
