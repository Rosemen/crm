package com.scau.crm.service.impl;

import com.scau.crm.entity.Admin;
import com.scau.crm.mapper.AdminMapper;
import com.scau.crm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * AdminServiceImpl:管理员业务接口实现类
 *
 * @author chen
 * @date 2019/02/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin get(String adminName) {
        Admin admin = adminMapper.get(adminName);
        return admin;
    }
}
