package com.scau.crm.mapper;

import com.scau.crm.entity.Customer;

import java.util.List;

/**
 * CustomerMapper:数据库操作Mapper接口
 *
 * @author chen
 * @date 2019/02/27
 */
public interface CustomerMapper {
    /**
     * 从数据库中查询Id 为 custId 的客户
     *
     * @param custId
     * @return Customer
     */
    Customer get(String custId);

    /**
     * 从数据库查询出所有的客户
     *
     * @return List<Customer>
     */
    List<Customer> list();

    /**
     * 更新数据库对应客户的信息
     *
     * @param customer
     * @return
     */
    void update(Customer customer);

    /**
     * 根据客户Id从数据库删除客户
     *
     * @param custId
     * @return
     */
    void delete(String custId);
}
