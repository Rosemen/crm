package com.scau.crm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 客户实体类
 *
 * @author chen
 * @date 2019/02/27
 */
@Data
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String custId;
    private String custName;
    private String custAddress;
    private String custPhone;
    private BaseDict custSource;
    private BaseDict custIndustry;
    private BaseDict custLevel;

}
