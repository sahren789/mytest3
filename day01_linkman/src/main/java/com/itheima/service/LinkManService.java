package com.itheima.service;

import com.itheima.pojo.LinkMan;

import java.util.List;

/**
 * 包名:com.itheima.service
 *
 * @author Leevi
 * 日期2020-06-30  15:48
 */
public interface LinkManService {
    void addLinkMan(LinkMan linkMan);
    List<LinkMan> findAll();
}
