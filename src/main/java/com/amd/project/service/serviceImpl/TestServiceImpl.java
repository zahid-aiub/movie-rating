package com.amd.project.service.serviceImpl;

import com.amd.project.model.Test;
import com.amd.project.repository.TestRepository;
import com.amd.project.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<Test> findAll() {
        return this.testRepository.findAllData();
    }

    @Override
    public int findCount(int min, int max) {
        return this.testRepository.findCount(min, max);
    }
}
