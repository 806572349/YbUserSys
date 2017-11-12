package com.yb.user;

import com.yb.user.filter.TokenFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.FilterRegistration;

/**
 * Created by 80657 on 2017/11/8.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.yb.user.entity")
public class APP {
    public static  void main(String[] args){
        SpringApplication.run(APP.class,args);

    }
    @Bean
    public FilterRegistrationBean filterRegistration(){

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TokenFilter());
        return  registrationBean;
    }
}
