package com.app.productcatelog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.productcatelog.model.ProductModel;
import com.app.productcatelog.service.ProductService;

@RestController
public class SearchRestController {

	@Autowired
	private ProductService productService;

	@PostMapping("/api/addProductDetail")
	public String addProductDetail(@RequestBody ProductModel product) {

		return productService.addProductDetail(product);
	}

	@GetMapping("/api/getProductDetailsByBrand/{brandName}")
	public List<ProductModel> getProductDetailsByBrand(@PathVariable String brandName) {

		return productService.getProductDetailsByBrand(brandName);
	}

	@GetMapping("/api/getProductDetailsBySeller/{sellerName}")
	public List<ProductModel> getProductDetailsBySeller(@PathVariable String sellerName) {

		return productService.getProductDetailsBySeller(sellerName);
	}

}
