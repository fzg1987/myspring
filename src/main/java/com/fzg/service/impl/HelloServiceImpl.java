package com.fzg.service.impl;

import com.fzg.dao.HelloDao;
import com.fzg.dao.impl.HelloDaoImpl;
import com.fzg.factory.BeanFactory;
import com.fzg.service.HelloService;

import java.util.List;

public class HelloServiceImpl implements HelloService {

//    private HelloDao helloDao = new HelloDaoImpl();
    public HelloServiceImpl(){
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getDao("helloDao"));
        }
    }

    private HelloDao helloDao = (HelloDao) BeanFactory.getDao("helloDao");
    @Override
    public List<String> findAll() {
        return helloDao.findAll();
    }
}
