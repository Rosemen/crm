package com.scau.crm.mapper;

import com.scau.crm.entity.Admin;
/**
 * AdminMapper:数据库操作Mapper接口
 *
 * @author chen
 * @date 2019/02/27
 */
public interface AdminMapper {
    /**
     * 根据帐户名从数据库中查询出管理员
     *
     * @param adminName
     * @return Admin
     */
    Admin get(String adminName);
}
