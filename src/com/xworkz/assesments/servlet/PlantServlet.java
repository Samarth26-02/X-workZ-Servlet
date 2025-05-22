
package com.xworkz.assesments.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/plant",loadOnStartup =5)

public class PlantServlet extends GenericServlet {

    public PlantServlet(){
        System.out.println("running plant servlet in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String cost=servletRequest.getParameter("cost");
        String type=servletRequest.getParameter("type");
        String soiltype=servletRequest.getParameter("soiltype");

        int wrappedCost=Integer.parseInt(cost);
        System.out.println(wrappedCost);


        PrintWriter writer=servletResponse.getWriter();

        //   servletResponse.setContentType("text/html.");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 color=red>");
        writer.println("Plant detail is obtained");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
