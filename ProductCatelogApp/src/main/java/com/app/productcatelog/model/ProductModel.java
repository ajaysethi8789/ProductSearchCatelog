package com.app.productcatelog.model;

public class ProductModel {

	private String productId;
	private String brandName;
	private int price;
	private int size;
	private String material;
	private String productName;
	private String stretch;
	private String fade;
	private String distress;
	private String sellerName;
	
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStretch() {
		return stretch;
	}

	public void setStretch(String stretch) {
		this.stretch = stretch;
	}

	public String getFade() {
		return fade;
	}

	public void setFade(String fade) {
		this.fade = fade;
	}

	public String getDistress() {
		return distress;
	}

	public void setDistress(String distress) {
		this.distress = distress;
	}

	@Override
	public String toString() {
		return "PantsData [brandName=" + brandName + ", price=" + price + ", size=" + size + ", material=" + material
				+ ", productName=" + productName + ", stretch=" + stretch + ", Fade=" + fade + ", distress=" + distress
				+ "productId"+productId+"sellerName"+sellerName+ "]";
	}

}
