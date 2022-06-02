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

    public List<Result> getResultPage(String to) {
       // Integer to1 = Integer.parseInt(to);
        List<Result> list = resultRepository.findByNameLike("%"+to+"%");
        System.out.println(list.size());
        String result1 = null;
        String result2 = null;
        String result3 = null;
        String result4 = null;

        result1 = list.get(0).getUrl();
        result2 = list.get(1).getUrl();
        result3 = list.get(2).getUrl();
        result4 = list.get(3).getUrl();

        return list;
    }

}
