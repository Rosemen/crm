package com.scau.crm.service.impl;

import com.scau.crm.entity.Customer;
import com.scau.crm.mapper.CustomerMapper;
import com.scau.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * CustomerServiceImpl:客户业务接口实现类
 *
 * @author chen
 * @date 2019/02/27
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer get(String custId) {
        Customer customer = customerMapper.get(custId);
        return customer;
    }

    @Override
    public List<Customer> list() {
        List<Customer> customerList = customerMapper.list();
        return customerList;
    }
}
