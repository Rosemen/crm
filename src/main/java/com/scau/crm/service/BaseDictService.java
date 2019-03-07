package com.scau.crm.service;

import com.scau.crm.entity.BaseDict;

import java.util.List;

/**
 * BaseDictService:数据词典业务接口
 *
 * @author chen
 * @date 2019/03/05
 */
public interface BaseDictService {
    /**
     * 查询数据词典所有信息
     *
     * @return List<BaseDict>
     * @param dictType
     */
    List<BaseDict> list(String dictType);
}
