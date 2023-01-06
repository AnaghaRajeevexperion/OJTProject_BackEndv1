package com.experion.ecommerce.dao;

import com.experion.ecommerce.entity.Product;
import com.experion.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel ="products",path="products" )
public interface ProductRepository extends JpaRepository<Product,String> {
}
