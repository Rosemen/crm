package com.scau.crm.service;

import com.scau.crm.entity.Admin;

/**
 * AdminService:管理员业务接口
 *
 * @author chen
 * @date 2019/02/27
 */
public interface AdminService {
    /**
     *根据帐户名查询管理员
     *
     * @param adminName
     * @return Admin
     */
    Admin get(String adminName);
}
