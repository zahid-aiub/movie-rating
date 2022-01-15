package com.amd.project.service;

import com.amd.project.model.Test;

import java.util.List;

public interface TestService {

    List<Test> findAll();

    int findCount(int min, int max);
}
