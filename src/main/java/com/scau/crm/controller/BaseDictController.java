package com.scau.crm.controller;

import com.scau.crm.entity.BaseDict;
import com.scau.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * BaseDictController:数字词典控制器
 *
 * @author chen
 * @date 2019/03/05
 */
@RestController
@RequestMapping("/dict")
public class BaseDictController {
    @Autowired
    private BaseDictService baseDictService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<BaseDict> list(String dictType){
        List<BaseDict> baseDictList = baseDictService.list(dictType);
        return baseDictList;
    }
}
