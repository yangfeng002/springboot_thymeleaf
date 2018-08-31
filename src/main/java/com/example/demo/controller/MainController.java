package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述:
 *
 * @author yangfeng12345@139.com
 * @version [版本号, 2018/8/23 14:36]
 * 更新信息 [版本，更新功能，作者，更新日期]
 */
@Controller
public class MainController
{
    /**
     *登录页面访问
     * @param req
     *
     *
     * @return
     */
    @GetMapping(value = "/login")
    public String login(HttpServletRequest req)
    {
        return "login";
    }

}
