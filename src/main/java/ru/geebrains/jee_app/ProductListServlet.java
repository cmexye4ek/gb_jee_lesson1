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
import java.util.ArrayList;

//http://localhost:8080/jee_app/ProductList
@WebServlet(name = "ProductListServlet", urlPatterns = "/ProductList")
public class ProductListServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductListServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter answer = resp.getWriter();
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        answer.printf("<table border=1>");
        answer.printf("<caption> Products List </caption>");
        answer.printf("<tr>" + "<th> ID </th>" + "<th> TITLE </th>" + "<th> COST </th>" + "</tr>");
        for (Product product : createProductList()) {
            answer.printf("<tr>" + "<td>" + product.getId() + "</td>" +  "<td>" + product.getTitle() + "</td>" + "<td>" + product.getCost() + "</td>" + "</tr>");
        }
        answer.printf("</table>");
    }

    private ArrayList<Product> createProductList() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "pen", 2));
        productList.add(new Product(2, "apple", 10));
        productList.add(new Product(3, "book", 100));
        productList.add(new Product(4, "cat", 500));
        productList.add(new Product(666, "satan's favorite scarf", 666));
        productList.add(new Product(5, "some shit", 80));
        productList.add(new Product(6, "milk", 50));
        productList.add(new Product(7, "bean", 5));
        productList.add(new Product(8, "cheeseburger", 110));
        productList.add(new Product(9, "another some shit", 53));
        return productList;
    }
}
