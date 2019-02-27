package com.scau.crm.service;

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
     * 查询所有联系人
     *
     * @return List<LinkMan>
     */
    List<LinkMan> list();
}
