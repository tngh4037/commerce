package com.example.demo.domain.customer.repository.mybatis;

import com.example.demo.domain.customer.domain.Faq;
import com.example.demo.domain.customer.dto.FaqSearchDto;
import com.example.demo.domain.customer.repository.FaqRepository;
import com.example.demo.global.common.PaginationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisFaqRepository implements FaqRepository {

    private final FaqMapper faqMapper;

    @Override
    public int count(FaqSearchDto faqSearchDto) {
        return faqMapper.count(faqSearchDto);
    }

    @Override
    public List<Faq> findAll(FaqSearchDto faqSearchDto, PaginationDto paginationDto) {
        return faqMapper.findAll(faqSearchDto, paginationDto);
    }

    @Override
    public Optional<Faq> findById(Integer faqNo) {
        return faqMapper.findById(faqNo);
    }

    @Override
    public Faq save(Faq faq) {
        faqMapper.save(faq);
        return faq;
    }

    @Override
    public void update(Integer faqNo, Faq faq) {
        faqMapper.update(faqNo, faq);
    }

    @Override
    public void deleteById(Integer faqNo) {
        faqMapper.deleteById(faqNo);
    }
}