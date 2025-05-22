
package com.xworkz.assesments.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fishfood",loadOnStartup =4)

public class FishFoodServlet extends GenericServlet {

    public FishFoodServlet(){
        System.out.println("running fish food servlet in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String brand=servletRequest.getParameter("brand");
        String quantity=servletRequest.getParameter("quantity");
        String cost=servletRequest.getParameter("cost");

        int wrappedCost=Integer.parseInt(cost);
        System.out.println(wrappedCost);


        PrintWriter writer=servletResponse.getWriter();

        //   servletResponse.setContentType("text/html.");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 color=red>");
        writer.println("Fish Food detail is obtained");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
