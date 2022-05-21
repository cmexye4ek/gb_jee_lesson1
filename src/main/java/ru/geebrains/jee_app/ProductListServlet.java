package ru.geebrains.jee_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ProductListServlet", urlPatterns = "/List")
public class ProductListServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductListServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter answer = resp.getWriter();
        resp.setHeader("Content-Type", "text/html; charset=utf-8");


        answer.println();
    }
}
