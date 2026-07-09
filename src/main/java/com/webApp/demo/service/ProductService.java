package com.webApp.demo.service;
import com.webApp.demo.Repo.ProductRepo;
import com.webApp.demo.model.Product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

@Autowired
ProductRepo repo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product(101,"Iphone",7000),
    //     new Product(102,"Xiaomi",3000),
    //     new Product(103,"Nokia",2000),
    //     new Product(104,"samsung",5000)));
    public List<Product> getProducts(){
      return repo.findAll();
    }
    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(null);
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }
    public void updateProduct(Product prod){
        repo.save(prod);
        
    }
    public void deleteProduct(int prodId){
        repo.deleteById(prodId);   
     }
}
