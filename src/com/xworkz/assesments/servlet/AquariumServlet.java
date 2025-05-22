
package com.xworkz.assesments.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/aquarium",loadOnStartup = 2)

public class AquariumServlet extends GenericServlet {

    public AquariumServlet(){
        System.out.println("running aquarium servlet in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String model=servletRequest.getParameter("model");
        String cost=servletRequest.getParameter("cost");
        String size=servletRequest.getParameter("size");
        String company=servletRequest.getParameter("company");
        String capacity=servletRequest.getParameter("capacity");

        int wrappedCost=Integer.parseInt(cost);
        System.out.println(wrappedCost);


        PrintWriter writer=servletResponse.getWriter();

        //   servletResponse.setContentType("text/html.");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 color=red>");
        writer.println("Aquarium detail is obtained");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
