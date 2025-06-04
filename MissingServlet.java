package com.xworkz.theft;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/missing",loadOnStartup = 2)
public class MissingServlet extends GenericServlet {

    public MissingServlet(){
        System.out.println("running missing complaint in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running missing complaint in Missing Servlet..");
        String name=servletRequest.getParameter("name");
        String mobile=servletRequest.getParameter("mobile");
        String age=servletRequest.getParameter("age");
        String address=servletRequest.getParameter("address");
        String location=servletRequest.getParameter("location");
        String marks=servletRequest.getParameter("marks");
        String gender=servletRequest.getParameter("gender");
        String language=servletRequest.getParameter("language");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("MissingResult.jsp");
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("mobile",mobile);
        servletRequest.setAttribute("age",age);
        servletRequest.setAttribute("address",address);
        servletRequest.setAttribute("location",location);
        servletRequest.setAttribute("marks",marks);
        servletRequest.setAttribute("gender",gender);
        servletRequest.setAttribute("language",language);
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
