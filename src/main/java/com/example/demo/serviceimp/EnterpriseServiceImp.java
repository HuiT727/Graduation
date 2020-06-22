package com.example.demo.serviceimp;

import com.example.demo.dao.ContractinfoMapper;
import com.example.demo.dao.EnterpriseinfoMapper;
import com.example.demo.entity.Contractinfo;
import com.example.demo.entity.Enterpriseinfo;
import com.example.demo.entity.EnterpriseinfoExample;
import com.example.demo.service.EnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service(value = "EnterpriseService")
public class EnterpriseServiceImp implements EnterpriseService {

    @Resource
    private EnterpriseinfoMapper enterpriseinfoMapper;
    @Resource
    private ContractinfoMapper contractinfoMapper;
    @Override
    public int reg(Enterpriseinfo enterpriseinfo) {

        EnterpriseinfoExample example = new EnterpriseinfoExample();
        EnterpriseinfoExample.Criteria criteria = example.createCriteria();
        criteria.andEnterpriseAccountEqualTo(enterpriseinfo.getEnterpriseAccount());
        List<Enterpriseinfo> list = enterpriseinfoMapper.selectByExample(example);
        if(!list.isEmpty()||list.size()>0){
            return 2;
        }else{
            int i = enterpriseinfoMapper.insertSelective(enterpriseinfo);
            return i!=0?1:0;
        }
    }

    @Override
    public List<Enterpriseinfo> login(Enterpriseinfo enterprise) {
        EnterpriseinfoExample example = new EnterpriseinfoExample();
        EnterpriseinfoExample.Criteria criteria = example.createCriteria();
        criteria.andEnterpriseAccountEqualTo(enterprise.getEnterpriseAccount());
        criteria.andEnterprisePwdEqualTo(enterprise.getEnterprisePwd());
        return  enterpriseinfoMapper.selectByExample(example);
    }

    @Override
    public int updateEnterprise(Enterpriseinfo enterprise) {
        EnterpriseinfoExample example = new EnterpriseinfoExample();
        EnterpriseinfoExample.Criteria criteria = example.createCriteria();
        int a = enterpriseinfoMapper.updateByPrimaryKeySelective(enterprise);
        if(a != 0){
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteEnterpriseById(Integer enterpriseId) {
        return enterpriseinfoMapper.deleteByPrimaryKey(enterpriseId);
    }

    @Override
    public Enterpriseinfo getEnterpriseById(Integer enterpriseId) {
        return enterpriseinfoMapper.selectByPrimaryKey(enterpriseId);
    }

    @Override
    public int ConnectContract(String contractName, Integer enterpriseId, Date contractTime, String contractMsg, String contractFile, Integer contractPage) {
        Contractinfo contractinfo = new Contractinfo(contractName,enterpriseId,contractTime,contractFile,contractPage);

        return contractinfoMapper.insert(contractinfo);
    }

    @Override
    public List<Enterpriseinfo> allEnterprise() {
        return enterpriseinfoMapper.selectByExample(new EnterpriseinfoExample());
    }


}
