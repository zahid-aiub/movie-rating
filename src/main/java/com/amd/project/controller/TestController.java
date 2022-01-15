package com.amd.project.controller;

import com.amd.project.model.Test;
import com.amd.project.service.TestService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "test")
public class TestController {

    private final TestService testService;

    @GetMapping("/all")
    public ApiResponse<List<Test>> getAll() {
        List<Test> testList = this.testService.findAll();
//        testList.forEach();
        return new ApiResponse<>(200, SUCCESS, testList);
    }

    @GetMapping("/count")
    public ApiResponse<Integer> getCount() {
        int approvalLevelList = this.testService.findCount(2, 10);
        return new ApiResponse<>(200, SUCCESS, approvalLevelList);
    }

}
