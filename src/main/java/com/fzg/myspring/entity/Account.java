package com.fzg.myspring.entity;

import com.fzg.myspring.Autowired;
import com.fzg.myspring.Component;
import com.fzg.myspring.Qualifier;
import com.fzg.myspring.Value;
import lombok.Data;

@Data
@Component
public class Account {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    @Value("22")
    private Integer age;
    @Autowired
    @Qualifier("myOrder")
    private Order order;
}
