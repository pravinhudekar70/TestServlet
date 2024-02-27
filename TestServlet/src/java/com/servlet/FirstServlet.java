/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
public class FirstServlet implements Servlet {

    //life cycle methods :
    ServletConfig  conf;
   
    @Override
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating  object");
    }
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException {
        System.out.println(" Servising ......");
        
        // set the content type of the  response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> this is my output form servlet method : </h1>");
        out.println(" <h1> Today data and time" +new Date().toString()+"</h1>");
    }
    @Override
    public void destroy(){
        System.out.println("Going to destroy servlet object");
    }
   
    // non life cycle methods
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    @Override
    public String getServletInfo(){
        String str = " This Servlet created by pravin hudekar";
        return str;
    }
}
