package com.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

/**
 * @author dell
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         1. 获取请求方式 ：GET
         * String getMethod()
         2. (*)获取虚拟目录：/day14
         * String getContextPath()
         3. 获取Servlet路径: /requestDemo1
         * String getServletPath()
         4. 获取get方式请求参数：name=zhangsan
         * String getQueryString()
         5. (*)获取请求URI：/day14/demo1
         * String getRequestURI():		/day14/requestDemo1
         * StringBuffer getRequestURL()  :http://localhost/day14/requestDemo1
         6. 获取协议及版本：HTTP/1.1
         * String getProtocol()

         7. 获取客户机的IP地址：
         * String getRemoteAddr()
         */

        String method = request.getMethod();
        System.out.println(method);
        System.out.println("-----------");

        String ContextPath = request.getContextPath();
        System.out.println(ContextPath);
        System.out.println("-----------");

        String ServletPath = request.getServletPath();
        System.out.println(ServletPath);
        System.out.println("-----------");

        String QueryString = request.getQueryString();
        System.out.println(QueryString);
        System.out.println("-----------");

        String RequestURI = request.getRequestURI();
        System.out.println(RequestURI);
        StringBuffer URL= request.getRequestURL();
        System.out.println(URL);
        System.out.println("-----------");

        String Protocol = request.getProtocol();
        System.out.println(Protocol);
        System.out.println("-----------");

        String LocalAddr = request.getLocalAddr();
        System.out.println(LocalAddr);






    }
}
