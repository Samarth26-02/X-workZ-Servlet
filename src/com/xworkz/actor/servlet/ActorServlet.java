package com.xworkz.actor.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actor",loadOnStartup = 1)

public class ActorServlet extends GenericServlet {

    public ActorServlet(){
        System.out.println("running actor servlet in tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("actorName");
        String language=servletRequest.getParameter("language");
        String salary=servletRequest.getParameter("salary");
        String blockBuster=servletRequest.getParameter("block buster");
        String flop=servletRequest.getParameter("flop");
        String upcomingMovie=servletRequest.getParameter("upcoming movie");
        String upcomingMovieDirector=servletRequest.getParameter("upcoming movie director");
        String upcomingMovieProducer=servletRequest.getParameter("upcoming movie producer");
        String upcomingMovieBudget=servletRequest.getParameter("upcoming movie budget");

        int wrappedSalary=Integer.parseInt(salary);

        PrintWriter writer=servletResponse.getWriter();

//        writer.println("text/html.");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("Actor detail is correct");
        writer.println("</body>");
        writer.println("</html>");

    }
}
