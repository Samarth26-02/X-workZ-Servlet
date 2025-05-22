
package com.xworkz.assesments.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fish",loadOnStartup = 3)

public class FishServlet extends GenericServlet {

    public FishServlet(){
        System.out.println("running fish servlet in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String color=servletRequest.getParameter("color");
        String lifespan=servletRequest.getParameter("lifespan");
        String cost=servletRequest.getParameter("cost");
        String type=servletRequest.getParameter("type");
        String size=servletRequest.getParameter("size");

        int wrappedCost=Integer.parseInt(cost);
        System.out.println(wrappedCost);


        PrintWriter writer=servletResponse.getWriter();

        //   servletResponse.setContentType("text/html.");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 color=red>");
        writer.println("Fish detail is obtained");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
