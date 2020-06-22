package com.example.demo.serviceimp;

import com.example.demo.dao.PrintinginfoMapper;
import com.example.demo.entity.Printinginfo;
import com.example.demo.entity.PrintinginfoExample;
import com.example.demo.service.PrintingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("PrintingService")
public class PrintingServiceImp implements PrintingService {
    @Resource
    private PrintinginfoMapper printinginfoMapper;
    @Override
    public int addPrinting(Printinginfo printinginfo) {
        return printinginfoMapper.insertSelective(printinginfo);
    }
}
