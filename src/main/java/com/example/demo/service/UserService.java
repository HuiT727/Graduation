package com.example.demo.service;

import com.example.demo.entity.Userinfo;

import java.util.List;

public interface UserService {

    /*
     *  * @param user	用户
     * <br/>
     * 用户注册
     * @return int
     * 1代表注册成功
     * 0代表注册失败
     * 2代表用户名重复
     * @author HuiT
     * @date 2020/4/12 23:05
     */
    public int reg(Userinfo user);

    //登录
    public List<Userinfo> admin(Userinfo user);

    //修改用户
    public int updateUser(Userinfo user);

    //添加用户
    public int addUser(Userinfo user);

    //根据id删除用户
    public int deleteUserById(Integer userId);

    //根据id查询用户
    public Userinfo getUserById(Integer userId);

    public List<Userinfo> allUser();

    public List<Userinfo> getUserByEnterpriseId(Integer EnterpriseId);

    public List<Userinfo> getUserByWorkId(Integer enterpriseId,String workId);

    public int getIdByUserIdAndEnterpriseId(Integer enterpriseId, Integer userId);
}
