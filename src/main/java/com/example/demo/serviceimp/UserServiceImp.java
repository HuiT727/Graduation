package com.example.demo.serviceimp;

import com.example.demo.dao.UserinfoMapper;
import com.example.demo.entity.Userinfo;
import com.example.demo.entity.UserinfoExample;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "UserService")
public class UserServiceImp implements UserService {

    @Resource
    private UserinfoMapper userinfoMapper;


    /*1代表注册成功
     * 0代表注册失败
     * 2代表用户名重复
     * */
    @Override
    public int reg(Userinfo user) {

        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();

        UserinfoExample example1 = new UserinfoExample();
        UserinfoExample.Criteria criteria1 = example.createCriteria();

        criteria1.andEnterpriseIdEqualTo(user.getEnterpriseId());
        List<Userinfo> userinfos = userinfoMapper.selectByExample(example1);
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (Userinfo userinfo:userinfos
             ) {
            int m = Integer.valueOf(userinfo.getUserWorkid());
            if(m>max){max = m;}
        }
        user.setUserWorkid(String.valueOf(max+1));
        criteria.andUserAccountEqualTo(user.getUserAccount());
        List<Userinfo> userinfoList = userinfoMapper.selectByExample(example);
        if (userinfoList.size()>0 && userinfoList!=null){
            return 2;
        }else{
            int i = userinfoMapper.insertSelective(user);
            if(i!=0){
                return 1;
            }
            return 0;
        }
    }

    @Override
    public List<Userinfo> admin(Userinfo user) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria= example.createCriteria();
        criteria.andUserAccountEqualTo(user.getUserAccount());
        criteria.andUserPwdEqualTo(user.getUserPwd());
        return userinfoMapper.selectByExample(example);
    }

    @Override
    public int updateUser(Userinfo user) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        int a = userinfoMapper.updateByPrimaryKeySelective(user);
        if(a != 0){
            return 1;
        }
        return 0;
    }


    @Override
    public int addUser(Userinfo user) {
        return userinfoMapper.insert(user);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return  userinfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public Userinfo getUserById(Integer userId) {
        return userinfoMapper.selectByPrimaryKey(userId);
    }

    /*
    * 提供给管理员
    * */
    @Override
    public List<Userinfo> allUser() {
        return userinfoMapper.selectByExample(new UserinfoExample());
    }

    @Override
    public List<Userinfo> getUserByEnterpriseId(Integer EnterpriseId) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria= example.createCriteria();
        criteria.andEnterpriseIdEqualTo(EnterpriseId);
        return userinfoMapper.selectByExample(example);
    }

    @Override
    public List<Userinfo> getUserByWorkId(Integer enterpriseId,String workId) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria= example.createCriteria();
        criteria.andEnterpriseIdEqualTo(enterpriseId).andUserWorkidEqualTo(workId);
        return userinfoMapper.selectByExample(example);
    }

    @Override
    public int getIdByUserIdAndEnterpriseId(Integer enterpriseId, Integer userId) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria= example.createCriteria();
        criteria.andEnterpriseIdEqualTo(enterpriseId);
        criteria.andUserWorkidEqualTo(String.valueOf(userId));
        Userinfo user = userinfoMapper.selectByExample(example).get(0);
        return user.getUserId();
    }
}
