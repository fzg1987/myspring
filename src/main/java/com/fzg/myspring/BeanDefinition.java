package com.fzg.myspring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BeanDefinition {
    private String beanName;
    private Class beanClass;
}