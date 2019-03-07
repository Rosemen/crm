package com.scau.crm.mapper;

import com.scau.crm.entity.BaseDict;

import java.util.List;

/**
 * BaseDictMapper:BaseDict的数据库操作mapper接口
 *
 * @author chen
 * @date 2019/03/05
 */
public interface BaseDictMapper {
    /**
     * 从数据库查询出数字词典所有信息
     *
     * @return List<BaseDict>
     * @param dictType
     */
    List<BaseDict> list(String dictType);
}
