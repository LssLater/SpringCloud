package com.yu.springcloud.controller;

import com.yu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yy
 * @Date: 2020/11/9 23:29
 * @Version: 1.0.0
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();
    }

}
