package com.example.demo.serviceimp;

import com.example.demo.dao.AdmininfoMapper;
import com.example.demo.entity.Admininfo;
import com.example.demo.entity.AdmininfoExample;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "AdminService")
public class AdminServiceImp implements AdminService {

    @Resource
    private AdmininfoMapper admininfoMapper;

    @Override
    public List<Admininfo> login(String adminAccount, String adminPwd) {
        AdmininfoExample example = new AdmininfoExample();
        AdmininfoExample.Criteria criteria = example.createCriteria();
        criteria.andAdminAccountEqualTo(adminAccount);
        criteria.andAdminPwdEqualTo(adminPwd);
        return admininfoMapper.selectByExample(example);

    }

    @Override
    public int updatePwd(String adminAccount, String adminPwd) {
        return 0;
    }
}
