package com.shop.service;

import com.shop.entity.Result;
import com.shop.repository.MemberRepository;
import com.shop.repository.ResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;

    public String getResultPage(String to) {
       // Integer to1 = Integer.parseInt(to);
        List<Result> list = resultRepository.findByName(to);
        return list.get(0).getUrl();
    }

}
