package com.scau.crm;


import com.scau.crm.config.RootConfig;
import com.scau.crm.config.WebConfig;
import com.scau.crm.entity.Customer;
import com.scau.crm.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CrmApplicationTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void contextLoad(){
        Customer customer = customerService.get("402880ea64a74fb20164a7558fe30002");
        System.out.println(customer.getCustName());
    }

}
