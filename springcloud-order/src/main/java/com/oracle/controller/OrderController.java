package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 订单的控制器
 * @Author: admin
 * @CreateDate: 2019/4/30 10:07
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/30 10:07
 * @UpdateRemark:
 * @Version: 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrder")
    public String getOrder() {

        String forObject = restTemplate.getForObject("http://zk-member/getMember", String.class);
        System.out.println("订单服务调用会员服务收到回应:" + forObject);
        return forObject;

    }


}
