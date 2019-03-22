package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


    @RestController
    public class Hello1Controller {
        @RequestMapping(value="/Hello1",method = GET)

            public Product getProductInJSON() {

                Product product = new Product();
                product.setName("abc");
                product.setQty(999);

                return product;

            }

    }
