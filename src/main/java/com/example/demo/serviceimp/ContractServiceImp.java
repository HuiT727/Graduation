package com.example.demo.serviceimp;

import com.example.demo.dao.ContractinfoMapper;
import com.example.demo.entity.Contractinfo;
import com.example.demo.entity.ContractinfoExample;
import com.example.demo.service.ContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value ="ContractService")
public class ContractServiceImp implements ContractService {
    @Resource
    private ContractinfoMapper contractinfoMapper;


    @Override
    public List<Contractinfo> getAllContract() {
        return contractinfoMapper.selectByExample(new ContractinfoExample());
    }

    @Override
    public List<Contractinfo> getContractinfoById(Integer id) {
        ContractinfoExample example = new ContractinfoExample();
        ContractinfoExample.Criteria criteria = example.createCriteria();
        criteria.andContractIdEqualTo(id);

        return contractinfoMapper.selectByExample(example);
    }

    @Override
    public int deleteContractById(Integer id) {
        return contractinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Contractinfo> getContractinfoByEnterpriseId(Integer id) {
        ContractinfoExample example = new ContractinfoExample();
        ContractinfoExample.Criteria criteria = example.createCriteria();
        criteria.andEnterpriseIdEqualTo(id);
        return contractinfoMapper.selectByExample(example);
    }

    @Override
    public boolean addContract(Contractinfo contractinfo) {
        ContractinfoExample example = new ContractinfoExample();
        ContractinfoExample.Criteria criteria = example.createCriteria();
        criteria.andEnterpriseIdEqualTo(contractinfo.getEnterpriseId());
        criteria.andContractFileEqualTo(contractinfo.getContractFile());
        criteria.andContractNameEqualTo(contractinfo.getContractName());
        List<Contractinfo> list = contractinfoMapper.selectByExample(example);
        if (list.isEmpty()){
            int i = contractinfoMapper.insert(contractinfo);

            return i!=0?true:false;
        }else{
            return  false;
        }

    }

    @Override
    public String getContractFileByid(Integer id) {
        return contractinfoMapper.selectByPrimaryKey(id).getContractFile();
    }

    @Override
    public int addContractNum(Integer id) {
        Contractinfo contract = contractinfoMapper.selectByPrimaryKey(id);
        contract.setContractNumbers(contract.getContractNumbers()+1);
        return  contractinfoMapper.updateByPrimaryKeySelective(contract);


    }

    @Override
    public int getContractNumberByContractId(Integer id) {
        Contractinfo contract = contractinfoMapper.selectByPrimaryKey(id);
        return contract.getContractNumbers();
    }
}
