package com.scau.crm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scau.crm.entity.Customer;
import com.scau.crm.entity.LinkMan;
import com.scau.crm.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * LinkManController: 联系人处理器
 *
 * @author chen
 * @date 2019/02/27
 */
@RestController
@RequestMapping(value = "/linkman")
public class LinkManController {
    @Autowired
    private LinkManService linkManService;

    @RequestMapping(value = "/get/{linkId}",method = RequestMethod.GET)
    public LinkMan get(@PathVariable("linkId") String linkId){
        LinkMan linkMan = linkManService.get(linkId);
        return linkMan;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public PageInfo<LinkMan> list(){
        PageHelper.startPage(0,4);
        List<LinkMan> linkManList = linkManService.list();
        PageInfo<LinkMan> pageInfo = new PageInfo<>(linkManList);
        return pageInfo;
    }
}
