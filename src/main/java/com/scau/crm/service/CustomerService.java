package com.scau.crm.service;

import com.scau.crm.entity.Customer;

import java.util.List;

/**
 * CustomerService:客户业务接口
 *
 * @author chen
 * @date 2019/02/27
 */
public interface CustomerService {
    /**
     * 根据Id查询客户
     *
     * @param custId
     * @return Customer
     */
    Customer get(String custId);

    /**
     * 查询所有客户
     *
     * @return List<Customer>
     */
    List<Customer> list();
}