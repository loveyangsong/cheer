package com.cheer.shop.controller;

import com.cheer.shop.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangsong
 * @title: IndexController
 * @data 2019/5/28 10:40
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/test")
    public String getInfo(){
        return indexService.Test();
    }


}
