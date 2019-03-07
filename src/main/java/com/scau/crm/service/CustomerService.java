package com.scau.crm.service;

import com.github.pagehelper.PageInfo;
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
     * 分页查询所有客户
     * @param pageNum
     * @param pageSize
     * @return PageInfo<Customer>
     */
    PageInfo<Customer> list(Integer pageNum,Integer pageSize);

    /**
     * 查询所有用户，不进行分页
     *
     * @return List<Customer>
     */
    List<Customer> listAll();

    /**
     * 更新客户
     *
     * @param customer
     * @return boolean
     */
    boolean update(Customer customer);

    /**
     * 根据客户Id删除客户信息
     *
     * @param custId
     * @return
     */
    boolean delete(String custId);
}