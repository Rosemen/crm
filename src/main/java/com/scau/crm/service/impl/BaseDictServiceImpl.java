package com.scau.crm.service.impl;

import com.scau.crm.entity.BaseDict;
import com.scau.crm.mapper.BaseDictMapper;
import com.scau.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * BaseDictServiceImpl:数字词典业务接口实现类
 *
 * @author chen
 * @date 2019/03/05
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> list(String dictType) {
        List<BaseDict> baseDictList = baseDictMapper.list(dictType);
        return baseDictList;
    }
}
