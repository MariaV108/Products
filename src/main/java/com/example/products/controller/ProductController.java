package com.example.products.controller;

import com.example.products.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public List<ProductDto> getProducts() {
        return List.of(
                new ProductDto("Book", 100),
                new ProductDto("Chocolate", 10),
                new ProductDto("T-Shirt", 50));
    }
}
