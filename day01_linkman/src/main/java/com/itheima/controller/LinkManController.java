package com.itheima.controller;

import com.itheima.entry.Result;
import com.itheima.pojo.LinkMan;
import com.itheima.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 包名:com.itheima.controller
 *
 * @author Leevi
 * 日期2020-06-30  15:50
 */
@RestController
@RequestMapping("linkman")
public class LinkManController {
    @Autowired
    private LinkManService linkManService;

    @RequestMapping("add")
    public Result addLinkMan(@RequestBody LinkMan linkMan){
        try {
            linkManService.addLinkMan(linkMan);
            return new Result(true,null,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,null,"添加失败");
        }
    }

    @RequestMapping("findAll")
    public Result findAll(){
        try {
            List<LinkMan> linkManList = linkManService.findAll();
            return new Result(true,linkManList,"查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,null,"查询失败");
        }
    }
}
