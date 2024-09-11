package org.sid.soap_server.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.soap_server.models.Product;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "productWs")
public class ProductWebService {
    @WebMethod(operationName = "sellPrice")
    public double sellPrice(@WebParam(name = "price") double price) {
        return price * 1.5;
    }

    @WebMethod(operationName = "getProduct")
    public Product getProduct(Integer code) {
        Product product = new Product();
        product.setCode(code);
        product.setName("table");
        product.setPrice(200);
        product.setDateCreation(new Date());
        return product;
    }
    @WebMethod(operationName = "getAllProducts")
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1, "table ", 200, new Date()),
                new Product(2, "verre  ", 260, new Date()),
                new Product(3, "stylo ", 3, new Date()),
                new Product(4, "pochette  ", 50, new Date())
        );
    }
}
