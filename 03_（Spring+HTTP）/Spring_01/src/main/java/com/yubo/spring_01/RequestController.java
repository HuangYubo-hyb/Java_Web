package com.yubo.spring_01;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestController {

    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        //1.获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式"+method);
        //2.获取请求url地址
        String url = request.getRequestURL().toString();
        System.out.println("请求地址"+url);
        //3.获取协议版本
        String protocol = request.getProtocol();
        System.out.println("协议版本"+protocol);
        //4.获取请求参数
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("请求参数"+name+"--"+age);

        //5.获取请求头
        String header = request.getHeader("Accept");
        System.out.println("请求头"+header);

        return "FINISHED";
    }
}
