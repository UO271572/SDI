package com.uniovi.sdi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "products", value = "/products")
public class ServletProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductsService storeProducts = (ProductsService) request.getSession().getAttribute("storeProducts");
        if(storeProducts==null){
            storeProducts = new ProductsService();
            List<Product> products = storeProducts.getProducts();
            request.getSession().setAttribute("storeProduct",products);
        }

        request.setAttribute("storeProduct",storeProducts.getProducts());
        getServletContext().getRequestDispatcher("/products-view.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
