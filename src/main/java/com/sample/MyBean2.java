package com.sample;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;

public class MyBean2 {
    @Autowired
    private MyBean bean;
    private Date date;

    public MyBean2() {
        super();
        date = Calendar.getInstance().getTime();
    }

    public MyBean getBean() {
        return bean;
    }

    public void SetBean(MyBean bean) {
        this.bean = bean;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "MyBean2{" +
                "bean=" + bean +
                ", date=" + date +
                '}';
    }
}
