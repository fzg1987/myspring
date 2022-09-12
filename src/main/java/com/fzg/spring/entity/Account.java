package com.fzg.spring.entity;

import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

@Data
//@Component
public class Account {
//    @Value("1")
//    private Integer id;
//    @Value("杨梦鑫")
//    private String name;
//    @Value("24")
//    private Integer age;
//    @Autowired
//    @Qualifier("myOrder")
    private Order myOrder;
}
