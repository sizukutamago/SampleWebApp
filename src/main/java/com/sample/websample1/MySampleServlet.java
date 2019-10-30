package com.sample.websample1;

import com.sample.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sample")
public class MySampleServlet extends HttpServlet {
    ApplicationContext app;

    @Override
    public void init() throws ServletException {
        super.init();
        app = new ClassPathXmlApplicationContext("/spring/application-config.xml");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyBean myBean1 = (MyBean) app.getBean("mybean1");
        req.setAttribute("mybean", myBean1);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        MyBean myBean1 = (MyBean) app.getBean("mybean1");
        myBean1.addMessage(message);
        req.setAttribute("mybean", myBean1);
        resp.sendRedirect("/sample");
    }
}
