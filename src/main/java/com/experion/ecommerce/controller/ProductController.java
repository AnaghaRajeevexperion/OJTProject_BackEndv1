package com.experion.ecommerce.controller;

import com.experion.ecommerce.entity.Products;
import com.experion.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Products> getProducts(@RequestParam(value="productType", required = false) String type){
        return productService.getAllProducts(type);
    }

    @GetMapping("/{field}/asc")
    public List<Products> getProductwithAscSort(@PathVariable String field){
        List<Products> allProduct = productService.findProductwithAscSorting(field);
        return allProduct;
    }

    @GetMapping("/{field}/desc")
    public List<Products> getProductwithDescSort(@PathVariable String field){
        List<Products> allProduct = productService.findProductwithDescSorting(field);
        return allProduct;
    }
}
