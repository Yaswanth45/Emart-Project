package com.cts.sas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.sas.entity.CategoryEntity;
import com.cts.sas.entity.OrdersEntity;
import com.cts.sas.entity.ProductsEntity;
import com.cts.sas.entity.SubCategoryEntity;
import com.cts.sas.model.Category;
import com.cts.sas.model.Orders;
import com.cts.sas.model.Products;
import com.cts.sas.model.SubCategory;
import com.cts.sas.service.CategoryService;
import com.cts.sas.service.OrdersService;
import com.cts.sas.service.ProductsService;
import com.cts.sas.service.SubCategoryService;

@RestController
@CrossOrigin
public class SellerController {

	@Autowired
	public CategoryService service;

	@Autowired
	public ProductsService serv;

	@Autowired
	public SubCategoryService sub;

	@Autowired
	public OrdersService ord;
	
	
	//Categories related Code written below

	@RequestMapping("categories/{name}")
	public ResponseEntity<Category> getByCategoryName(@PathVariable(name = "name") String categoryName) {
		ResponseEntity<Category> result;
		Category entity = service.findByCategoryName(categoryName).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Category>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	
	@RequestMapping("/categories")
	public ResponseEntity<Iterable<CategoryEntity>> findAll1() {
		return new ResponseEntity<Iterable<CategoryEntity>>(service.findAll1(),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/categories")
	void addCategories(@RequestBody CategoryEntity cat) {
		service.addCategories(cat);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/categories")
	void updateCategories(@RequestBody CategoryEntity cat) {
		service.updateCategories(cat);
	}
	
	//Products related Code written below

	@RequestMapping("products/{pname}")
	public ResponseEntity<Products> getByProductName(@PathVariable(name = "pname") String productName) {
		ResponseEntity<Products> result;
		Products ent = serv.findByProductName(productName).orElse(null);
		if (null != ent) {
			result = new ResponseEntity<Products>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Products>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	
	
	@RequestMapping("/products")
	public ResponseEntity<Iterable<ProductsEntity>> findAll2() {
		return new ResponseEntity<Iterable<ProductsEntity>>(serv.findAll2(),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	void addProducts(@RequestBody ProductsEntity pro) {
		serv.addProducts(pro);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/products")
	void updateProducts(@RequestBody ProductsEntity pro) {
		serv.addProducts(pro);
	}
	
	
	//SubCategories related Code written below
	
	@RequestMapping("subcategories/{sname}")
	public ResponseEntity<SubCategory> getBySubCategoryName(
			@PathVariable(name = "sname") String subCategoryName) {
		ResponseEntity<SubCategory> result;
		SubCategory ent = sub.findBySubCategoryName(subCategoryName).orElse(null);
		if (null != ent) {
			result = new ResponseEntity<SubCategory>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<SubCategory>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/subcategories")
	void addSubCategories(@RequestBody SubCategoryEntity subc) {
		sub.addSubCategories(subc);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/subcategories")
	void updateSubCategories(@RequestBody SubCategoryEntity subc) {
		sub.updateSubCategories(subc);
	}
	
	
	//Orders related Code written below
	
	@RequestMapping("orders/{id}")
	public ResponseEntity<Orders> getById(@PathVariable(name = "id") int orderId) {
		ResponseEntity<Orders> result;
		Orders ent = ord.findById(orderId);
		if (null != ent) {
			result = new ResponseEntity<Orders>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Orders>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

	@RequestMapping("/orders")
	public ResponseEntity<Iterable<OrdersEntity>> findAll() {
		return new ResponseEntity<Iterable<OrdersEntity>>(ord.findAll(),HttpStatus.OK);
	}
}