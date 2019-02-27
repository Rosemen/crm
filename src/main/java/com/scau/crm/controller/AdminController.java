package com.scau.crm.controller;

import com.scau.crm.entity.Admin;
import com.scau.crm.entity.Customer;
import com.scau.crm.service.AdminService;
import com.scau.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * AdminController:管理员控制器
 *
 * @author chen
 * @date 2019/02/27
 */
@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/get/{adminName}",method = RequestMethod.GET)
    public Admin get(@PathVariable("adminName") String adminName){
        Admin admin = adminService.get(adminName);
        return admin;
    }
}
