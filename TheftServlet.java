package com.xworkz.theft;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/theft",loadOnStartup = 1)
public class TheftServlet extends GenericServlet {

    public TheftServlet(){
        System.out.println("running theft servlet in tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running theft complaint in TheftServlet");
        String name=servletRequest.getParameter("name");
        String mobile=servletRequest.getParameter("mobile");
        String age=servletRequest.getParameter("age");
        String address=servletRequest.getParameter("address");
        String location=servletRequest.getParameter("location");
        String item=servletRequest.getParameter("item");
        String lostOn=servletRequest.getParameter("lostOn");

        System.out.println("Complaint registered");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("TheftResult.jsp");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("mobile",mobile);
        servletRequest.setAttribute("age",age);
        servletRequest.setAttribute("address",address);
        servletRequest.setAttribute("location",location);
        servletRequest.setAttribute("item",item);
        servletRequest.setAttribute("lostOn",lostOn);
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
