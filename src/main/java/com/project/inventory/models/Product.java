package com.project.inventory.models;

import javafx.beans.property.*;

public class Product {

	private IntegerProperty productID;
	private StringProperty upc;
	private StringProperty productName;
	private IntegerProperty quantity;
	private DoubleProperty price;
	private StringProperty manufacturer;
	private StringProperty subcategory;
	private IntegerProperty manufacturerInt = new SimpleIntegerProperty(0);
	private IntegerProperty subcategoryInt = new SimpleIntegerProperty(0);

	// default constructor
	public Product() {
	}

	/*
	 * constructor with int manufacturer and subcategory, no productId
	 */
	public Product(String upc, String productName, int quantity, double price, int manufacturer, int subcategory) {
		try {
			if (quantity >= 0 && price >= 0) {
				this.upc = new SimpleStringProperty(upc);
				this.productName = new SimpleStringProperty(productName);
				this.quantity = new SimpleIntegerProperty(quantity);
				this.price = new SimpleDoubleProperty(price);
				this.manufacturerInt = new SimpleIntegerProperty(manufacturer);
				this.subcategoryInt = new SimpleIntegerProperty(subcategory);
			}
			else {
				throw new ArithmeticException("Failed to create new instance of Product. quantity or price is a negative value");
			}
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * constructor with productId
	 */
	public Product(String upc, String productName, int quantity, double price, String manufacturer, String subcategory) {
		try {
			if (quantity >= 0 && price >= 0) {
				this.upc = new SimpleStringProperty(upc);
				this.productName = new SimpleStringProperty(productName);
				this.quantity = new SimpleIntegerProperty(quantity);
				this.price = new SimpleDoubleProperty(price);
				this.manufacturer = new SimpleStringProperty(manufacturer);
				this.subcategory = new SimpleStringProperty(subcategory);
			}
			else {
				throw new ArithmeticException("Failed to create new instance of Product. productId, quantity, or price is a negative value");
			}
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public Product(String upc, String productName, int quantity, double price) {
		this.upc = new SimpleStringProperty(upc);
		this.productName = new SimpleStringProperty(productName);
		this.quantity = new SimpleIntegerProperty(quantity);
		this.price = new SimpleDoubleProperty(price);
	}


	public int getProductID() { return productID.get(); }

	public String getUpc() { return upc.get(); }

	public String getProductName() { return productName.get(); }

	public int getQuantity() { return quantity.get(); }

	public double getPrice() { return price.get(); }

	public String getManufacturer() { return manufacturer.get(); }

	public String getSubcategory() { return subcategory.get(); }

	public int getSubcategoryInt() { return subcategoryInt.get(); }

	public int getManufacturerInt() { return manufacturerInt.get(); }

	public void setProductID(int productID) {
		this.productID.set(productID);
	}

	public void setUpc(String upc) { this.upc.set(upc);	}

	public void setProductName(String productName) {
		this.productName.set(productName);
	}

	public void setQuantity(int quantity) {
		this.quantity.set(quantity);
	}

	public void setPrice(double price) {
		this.price.set(price);
	}

	public void setManufacturerInt(int manufacturer) {
		this.manufacturerInt.set(manufacturer);
	}

	public void setSubcategoryInt(int subcategory) {
		this.subcategoryInt.set(subcategory);
	}
}
