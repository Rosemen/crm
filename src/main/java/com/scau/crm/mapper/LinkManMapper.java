package com.scau.crm.mapper;

import com.scau.crm.entity.LinkMan;

import java.util.List;

/**
 * LinkManMapper:数据库操作Mapper接口
 *
 * @author chen
 * @date 2019/02/27
 */
public interface LinkManMapper {
    /**
     * 根据Id从数据库中查询出联系人
     *
     * @param linkId
     * @return LinkMan
     */
    LinkMan get(String linkId);

    /**
     * 从数据库中查询出所有的联系人
     *
     * @return List<LinkMan>
     */
    List<LinkMan> list();

    /**
     * 更新数据库中的联系人信息
     * @param linkMan
     */
    void update(LinkMan linkMan);

    /**
     * 根据联系人Id从数据库中删除联系人信息
     *
     * @param linkId
     */
    void delete(String linkId);
}
