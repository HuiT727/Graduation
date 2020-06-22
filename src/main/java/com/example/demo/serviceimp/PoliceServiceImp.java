package com.example.demo.serviceimp;

import com.example.demo.dao.PoliceinfoMapper;
import com.example.demo.entity.Policeinfo;
import com.example.demo.entity.PoliceinfoExample;
import com.example.demo.service.PoliceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "PoliceService")
public class PoliceServiceImp implements PoliceService {
    @Resource
    private PoliceinfoMapper policeinfoMapper;

    @Override
    public List<Policeinfo> login(String account, String pwd) {
        PoliceinfoExample example = new PoliceinfoExample();
        PoliceinfoExample.Criteria criteria = example.createCriteria();
        criteria.andPoliceAccountEqualTo(account).andPolicePwdEqualTo(pwd);

        return policeinfoMapper.selectByExample(example);
    }

    @Override
    public int insertPolice(String policeAccount, String policePwd, String policeName, String policePhone, String policeSex, String policeCard) {
        PoliceinfoExample example = new PoliceinfoExample();
        PoliceinfoExample.Criteria criteria = example.createCriteria();
        criteria.andPoliceAccountEqualTo(policeAccount);
        List<Policeinfo> policeinfoList = policeinfoMapper.selectByExample(example);
        if(policeinfoList.isEmpty()){
            Policeinfo policeinfo = new Policeinfo(policeAccount,policePwd,policeName,policePhone,policeSex,policeCard);
            return policeinfoMapper.insert(policeinfo);
        }else {
            return 0;
        }

    }

    @Override
    public int deletePolice(Integer policeId) {

        return policeinfoMapper.deleteByPrimaryKey(policeId);
    }

    @Override
    public List<Policeinfo> allPolice() {
        return policeinfoMapper.selectByExample(new PoliceinfoExample());
    }

    @Override
    public int reg(Policeinfo police) {
        PoliceinfoExample example = new PoliceinfoExample();
        PoliceinfoExample.Criteria criteria = example.createCriteria();
        criteria.andPoliceAccountEqualTo(police.getPoliceAccount());
        List<Policeinfo> list = policeinfoMapper.selectByExample(example);
        if(!list.isEmpty()||list.size()>0){
            return 2;
        }else{
            int i = policeinfoMapper.insertSelective(police);
            return i!=0?1:0;
        }
    }

    @Override
    public Policeinfo getPoliceById(Integer id) {
        return policeinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePolice(Policeinfo police) {
        PoliceinfoExample example = new PoliceinfoExample();
        PoliceinfoExample.Criteria criteria = example.createCriteria();
        int a = policeinfoMapper.updateByPrimaryKeySelective(police);
        if(a != 0){
            return 1;
        }
        return 0;
    }
}
