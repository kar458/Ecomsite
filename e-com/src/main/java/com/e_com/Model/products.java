package com.e_com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products") 
public class products {
	
	@Id
	@Column(name = "uniq_id")
    private String uniq_id;

    @Column(name = "product_url")
    private String product_url;

    @Column(name = "product_name",length = 500)
    private String product_name;

    @Column(name = "product_category_tree")
    private String productCategoryTree;

    @Column(name = "pid")
    private String pid;

    @Column(name = "retail_price")
    private Double retail_price;

    @Column(name = "discounted_price")
    private Double discountedPrice;

    @Column(name = "image",length= 2900)
    private String image;

    @Column(name = "is_FK_Advantage_product")
    private String is_FK_Advantage_product;

    @Column(name = "description",length = 6000)
    private String description;

    @Column(name = "product_rating")
    private String product_rating;

    @Column(name = "overall_rating")
    private String overall_rating;

    @Column(name = "brand")
    private String brand;

    @Column(name = "product_specifications",length = 4800)
    private String product_specifications;

	public String getUniq_id() {
		return uniq_id;
	}

	public void setUniq_id(String uniq_id) {
		this.uniq_id = uniq_id;
	}

	public String getProduct_url() {
		return product_url;
	}

	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_category_tree() {
		return productCategoryTree;
	}

	public void setProduct_category_tree(String product_category_tree) {
		this.productCategoryTree = product_category_tree;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Double getRetail_price() {
		return retail_price;
	}

	public void setRetail_price(Double retail_price) {
		this.retail_price = retail_price;
	}

	public Double getDiscounted_price() {
		return discountedPrice;
	}

	public void setDiscounted_price(Double discounted_price) {
		this.discountedPrice = discounted_price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIs_FK_Advantage_product() {
		return is_FK_Advantage_product;
	}

	public void setIs_FK_Advantage_product(String is_FK_Advantage_product) {
		this.is_FK_Advantage_product = is_FK_Advantage_product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProduct_rating() {
		return product_rating;
	}

	public void setProduct_rating(String product_rating) {
		this.product_rating = product_rating;
	}

	public String getOverall_rating() {
		return overall_rating;
	}

	public void setOverall_rating(String overall_rating) {
		this.overall_rating = overall_rating;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProduct_specifications() {
		return product_specifications;
	}

	public void setProduct_specifications(String product_specifications) {
		this.product_specifications = product_specifications;
	}

	
	
	

}
