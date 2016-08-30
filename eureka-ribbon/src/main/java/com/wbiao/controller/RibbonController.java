package com.wbiao.controller;

import com.wbiao.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/8/25.
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {

        System.out.println("调用外部方法输出");

        return ribbonService.addService();
    }

    @RequestMapping(value = "demo")
    public String helloWorld(){
        return "输出本地方法";
    }

}
