package com.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String bookName;
    public Book(){
        System.out.println("com.bean.lifecycle.Book Initializing ");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("com.bean.lifecycle.Book.setBeanFactory invoke");
    }

    public void setBeanName(String name) {
        System.out.println("com.bean.lifecycle.Book.setBeanName invoke");
    }

    public void destroy() throws Exception {
        System.out.println("com.bean.lifecycle.Book.destory invoke");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("com.bean.lifecycle.Book.afterPropertiesSet invoke");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("com.bean.lifecycle.Book.setApplicationContext invoke");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
        System.out.println("setBookName: com.bean.lifecycle.Book name has set.");
    }

    public void myPostConstruct(){
        System.out.println("com.bean.lifecycle.Book.myPostConstruct invoke");
    }

    // 自定义初始化方法
    @PostConstruct
    public void springPostConstruct(){
        System.out.println("@PostConstruct");
    }

    public void myPreDestory(){
        System.out.println("com.bean.lifecycle.Book.myPreDestory invoke");
        System.out.println("---------------destroy-----------------");
    }

    // 自定义销毁方法
    @PreDestroy
    public void springPreDestory(){
        System.out.println("@PreDestory");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("------inside finalize-----");
    }
}
