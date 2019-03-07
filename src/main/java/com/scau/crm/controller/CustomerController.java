package com.scau.crm.controller;

import com.github.pagehelper.PageInfo;
import com.scau.crm.entity.Customer;
import com.scau.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/get/{custId}", method = RequestMethod.GET)
    public String get(@PathVariable("custId") String custId, Model model) {
        Customer customer = customerService.get(custId);
        model.addAttribute("customer", customer);
        return "customer/edit";
    }

    @RequestMapping(value = "/list", method = {RequestMethod.POST,RequestMethod.GET})
    public String list(Model model, Integer pageNum, Integer pageSize) {
        PageInfo<Customer> pageInfo = customerService.list(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "customer/list";
    }

    @ResponseBody
    @RequestMapping(value = "/listAll", method = RequestMethod.POST)
    public List<Customer> listAll(Model model) {
        List<Customer> customerList = customerService.listAll();
        return customerList;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Customer customer) {
        customerService.update(customer);
        return "forward:/customer/list";
    }

    @RequestMapping(value = "/delete/{custId}", method = RequestMethod.GET)
    public String delete(@PathVariable("custId") String custId) {
        boolean result = customerService.delete(custId);
        return "forward:/customer/list";
    }
}
