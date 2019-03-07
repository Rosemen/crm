package com.scau.crm.controller;

import com.github.pagehelper.PageInfo;
import com.scau.crm.entity.LinkMan;
import com.scau.crm.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * LinkManController: 联系人处理器
 *
 * @author chen
 * @date 2019/02/27
 */
@Controller
@RequestMapping(value = "/linkman")
public class LinkManController {
    @Autowired
    private LinkManService linkManService;

    @RequestMapping(value = "/get/{linkId}", method = RequestMethod.GET)
    public String get(@PathVariable("linkId") String linkId, Model model) {
        LinkMan linkMan = linkManService.get(linkId);
        model.addAttribute("linkMan", linkMan);
        return "linkman/edit";
    }

    @RequestMapping(value = "/list", method = {RequestMethod.POST,RequestMethod.GET})
    public String list(Model model, Integer pageNum, Integer pageSize) {
        PageInfo<LinkMan> pageInfo = linkManService.list(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "linkman/list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(LinkMan linkMan) {
        linkManService.update(linkMan);
        return "forward:/linkman/list";
    }

    @RequestMapping(value = "/delete/{linkId}", method = RequestMethod.GET)
    public String delete(@PathVariable("linkId") String linkId) {
        linkManService.delete(linkId);
        return "forward:/linkman/list";
    }
}
