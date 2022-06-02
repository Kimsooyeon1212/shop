package com.shop.repository;

import com.shop.entity.Member;
import com.shop.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    //List<Result> findById(Integer id);

}
