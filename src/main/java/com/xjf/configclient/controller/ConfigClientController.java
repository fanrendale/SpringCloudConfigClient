package com.xjf.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjf
 * @date 2019/4/3 17:35
 */
@RestController
public class ConfigClientController {

    @Value("${info}")
    private String info;

    /**
     * 提供一个restful服务
     *
     * @return 返回 配置中的info信息
     */
    @RequestMapping("/info")
    public String info(){
        return info;
    }
}
