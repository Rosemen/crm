package com.scau.crm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scau.crm.entity.LinkMan;
import com.scau.crm.mapper.LinkManMapper;
import com.scau.crm.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * LinkManServiceImpl:联系人业务接口实现类
 *
 * @author chen
 * @date 2019/02/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LinkManServiceImpl implements LinkManService {

    @Autowired
    private LinkManMapper linkManMapper;

    @Override
    public LinkMan get(String linkId) {
        LinkMan linkMan = linkManMapper.get(linkId);
        return linkMan;
    }

    @Override
    public PageInfo<LinkMan> list(Integer pageNum,Integer pageSize) {
        if (null == pageNum){
            pageNum = 1;
        }
        if (null == pageSize){
            pageSize = 3;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<LinkMan> linkManList = linkManMapper.list();
        PageInfo<LinkMan> pageInfo = new PageInfo<>(linkManList);
        return pageInfo;
    }

    @Override
    public boolean update(LinkMan linkMan) {
        linkManMapper.update(linkMan);
        return true;
    }

    @Override
    public boolean delete(String linkId) {
        linkManMapper.delete(linkId);
        return true;
    }
}
