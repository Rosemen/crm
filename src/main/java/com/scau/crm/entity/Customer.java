package com.scau.crm.entity;

import lombok.Data;

/**
 * 客户实体类
 *
 * @author chen
 * @date 2019/02/27
 */
@Data
public class Customer {
    private String custId;
    private String custName;
    private String custAddress;
    private String custPhone;
    private String custSource;
    private String custIndustry;
    private String custLevel;

}
