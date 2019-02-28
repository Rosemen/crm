package com.scau.crm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scau.crm.entity.Customer;
import com.scau.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * CustomerController:客户处理器
 *
 * @author chen
 * @date 2019/02/27
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/get/{custId}",method = RequestMethod.GET)
    public Customer get(@PathVariable("custId") String custId){
        Customer customer = customerService.get(custId);
        return customer;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        PageHelper.startPage(0,3);
        List<Customer> customerList = customerService.list();
        PageInfo<Customer> pageInfo = new PageInfo<>(customerList);
        model.addAttribute("pageInfo",pageInfo);
        return "customer/list";
    }
}
