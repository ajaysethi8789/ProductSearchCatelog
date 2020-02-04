package com.app.productcatelog.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.productcatelog.model.ProductModel;
import com.app.productcatelog.service.ProductService;

@SpringBootTest
class ProductCatelogApplicationTests {

	@Autowired
	ProductService productService;

	@Test
	public void unitTestAddProductDetails() {

		System.out.println("*************Start unitTestAddProductDetails*************");

		ProductModel product = new ProductModel();

		product.setBrandName("HIGHLANDER");
		product.setDistress("Clean Look");
		product.setFade("Dark");
		product.setMaterial("Cotton");
		product.setSellerName("FlashStar Commerce");
		product.setProductId("product001");
		product.setStretch("Stretchable");
		product.setSize(32);
		product.setProductName("JEANS");
		product.setPrice(2000);

		String actualResult = productService.addProductDetail(product);
		System.out.println("Success Message" + actualResult);

		assertEquals("Product detail has been saved successfully", actualResult);

		System.out.println("*************End unitTestAddProductDetails*************");
	}

	
	@Test
	public void unitTestGetProductDetailsByBrand() {

		System.out.println("*************Start unitTestGetProductDetailsByBrand*************");

		List<ProductModel> product = productService.getProductDetailsByBrand("HIGHLANDER");

		assertEquals("HIGHLANDER", product.get(0).getBrandName());

		System.out.println("*************End unitTestGetProductDetailsByBrand*************");
	}

	
	@Test
	public void unitTestGetProductDetailsBySeller() {

		System.out.println("*************start unitTestGetProductDetailsBySeller*************");

		List<ProductModel> product = productService.getProductDetailsBySeller("FlashStar Commerce");

		assertEquals("FlashStar Commerce", product.get(0).getSellerName());

		System.out.println("*************end unitTestGetProductDetailsBySeller*************");
	}

}
