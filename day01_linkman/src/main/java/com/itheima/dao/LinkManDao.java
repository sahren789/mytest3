package com.itheima.dao;

import com.itheima.pojo.LinkMan;

import java.util.List;

/**
 * 包名:com.itheima.dao
 *
 * @author Leevi
 * 日期2020-06-30  15:49
 */
public interface LinkManDao {
    void addLinkMan(LinkMan linkMan);
    List<LinkMan> findAll();
}
