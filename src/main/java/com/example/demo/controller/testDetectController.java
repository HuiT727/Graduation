package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.serviceimp.testService;
import com.example.demo.util.JwtIgnore;
import com.mathworks.toolbox.javabuilder.MWException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@Slf4j
@RestController
public class testDetectController {

    @Resource
    private testService testService;


}
