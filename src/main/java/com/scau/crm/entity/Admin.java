package com.scau.crm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员实体类
 *
 * @author chen
 * @date 2019/02/27
 */
@Data
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    private String adminId;
    private String adminName;
    private String adminPassword;
    private Integer adminGender;
    private String adminPhone;
    private String adminMobile;
}
