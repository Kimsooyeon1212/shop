package com.shop.repository;

import com.shop.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ResultRepository extends JpaRepository<Result, String> {

    List<Result> findByName(String name);

}
