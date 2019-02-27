package com.scau.crm.entity;

import lombok.Data;

/**
 * 管理员实体类
 *
 * @author chen
 * @date 2019/02/27
 */
@Data
public class Admin {
    private String adminId;
    private String adminName;
    private String adminPassword;
    private Integer adminGender;
    private String adminPhone;
    private String adminMobile;
}
