package com.e_com.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e_com.Model.cart;
import com.e_com.Model.products;
import com.e_com.Repository.CartRepo;
import com.e_com.Repository.EcomRepo;



@Controller
public class EcomController {
	
	
	@Autowired
	private EcomRepo repo;
	
	
	@Autowired
	private CartRepo cartrepo;
	
	
	@GetMapping("/total_records")
	@ResponseBody
	public List<products> showall(){
		return repo.findAll();
	}
	
	@GetMapping("/search")
	@ResponseBody
	 public List<products> searchs(@RequestParam(value="product_category_tree") String product_category_tree){
		return repo.findByproductCategoryTree(product_category_tree);
	}  
	
	 
//	 @GetMapping("/searchAndSort")
//		@ResponseBody
//		 public List<products> searchAndSort(@RequestParam(value="product_category_tree") String product_category_tree){
//			return repo.findBydiscountedPrice(product_category_tree);
//		}  
	 
	/*
	 * @GetMapping("/search")
	 * 
	 * @ResponseBody public List<products> searchs(){ return repo.category("Slim");
	 * }
	 */
	 
	 
	 @GetMapping("/product/{id}")
	 public ResponseEntity<products> getProductById(@PathVariable String id) {
	     Optional<products> product = repo.findById(id);
	     if (product.isPresent()) {
	         return ResponseEntity.ok(product.get());
	     } else {
	         return ResponseEntity.notFound().build();
	     }
	 }
	
	 
		@PostMapping("/addtocart/{id}")
		@ResponseBody
		 public cart addtocart(@PathVariable String id){
			 Optional<products> productOptional = repo.findById(id);
			 
		            products product = productOptional.get();
		            
		            cart Cartrecord = new cart();
		            Cartrecord.setUniq_id(product.getUniq_id());
		            Cartrecord.setProduct_url(product.getProduct_url());
		            Cartrecord.setProduct_name(product.getProduct_name());
		            Cartrecord.setProduct_category_tree(product.getProduct_category_tree());
		            Cartrecord.setPid(product.getPid());
		            
		            Cartrecord.setRetail_price(product.getRetail_price());
		            Cartrecord.setDiscounted_price(product.getDiscounted_price());
		            
		            Cartrecord.setImage(product.getImage());
		            
		            Cartrecord.setIs_FK_Advantage_product(product.getIs_FK_Advantage_product());
		            
		            Cartrecord.setDescription(product.getDescription());
		            
		            Cartrecord.setProduct_rating(product.getProduct_rating());
		            
		            
		            Cartrecord.setOverall_rating(product.getOverall_rating());
		            
		            Cartrecord.setBrand(product.getBrand());
		            
		            Cartrecord.setProduct_specifications(product.getProduct_specifications());
		
		return cartrepo.save(Cartrecord);
}
		

		
		@GetMapping("/viewcart")
		@ResponseBody
		public List<cart> cartall(){
			return cartrepo.findAll();
		}
		
		
		
		
		
}
