package com.scau.crm.service;

import com.github.pagehelper.PageInfo;
import com.scau.crm.entity.LinkMan;

import java.util.List;

/**
 * LinkManService:联系人业务接口
 *
 * @author chen
 * @date 2019/02/27
 */
public interface LinkManService {
    /**
     * 根据id查询联系人
     *
     * @param linkId
     * @return
     */
    LinkMan get(String linkId);

    /**
     * 分页查询所有联系人
     *
     * @param pageNum
     * @param pageSize
     * @return PageInfo<LinkMan>
     */
    PageInfo<LinkMan> list(Integer pageNum,Integer pageSize);

    /**
     * 更新联系人信息
     *
     * @param linkMan
     * @return boolean
     */
    boolean update(LinkMan linkMan);

    /**
     * 删除联系人
     *
     * @param linkId
     * @return boolean
     */
    boolean delete(String linkId);
}
