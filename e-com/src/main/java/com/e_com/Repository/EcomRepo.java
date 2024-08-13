package com.e_com.Repository;

import com.e_com.Model.products;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface EcomRepo extends JpaRepository<products, String> {
	
    @Query("SELECT p FROM products p WHERE p.product_category_tree = :product_category_tree")
	List<products> findByproductCategoryTree(@Param("product_category_tree") String product_category_tree);
	
	
//	@Query("SELECT e FROM products e ORDER BY e.discounted_price ASC")
//    List<EcomModel> findAllSortedByDiscountedPrice();
	
	
//	@Query("SELECT e FROM products e WHERE e.product_category_tree = :product_category_tree ORDER BY e.discounted_price ASC")
//    List<products> findBydiscountedPrice(@Param("product_category_tree") String productCategoryTree);
	
	
	
	
	 	//@Query("SELECT * FROM products WHERE brand = ?0")
	    //List<products> fetchBrand(String brand);
	
	
	
}

