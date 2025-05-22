package com.xworkz.assesments.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/accessories",loadOnStartup = 1)

public class AccessoryServlet extends GenericServlet {

    public AccessoryServlet(){
        System.out.println("running accessory servlet in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("accessoryName");
        String type=servletRequest.getParameter("type");
        String warranty=servletRequest.getParameter("warranty");
        String price=servletRequest.getParameter("price");
        String quantity=servletRequest.getParameter("quantity");

        int wrappedPrice=Integer.parseInt(price);
        System.out.println(wrappedPrice);


        PrintWriter writer=servletResponse.getWriter();

        //   servletResponse.setContentType("text/html.");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 color=red>");
        writer.println("Accessory detail is obtained");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
