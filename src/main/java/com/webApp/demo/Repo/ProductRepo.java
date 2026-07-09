package com.webApp.demo.Repo;
import com.webApp.demo.model.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
