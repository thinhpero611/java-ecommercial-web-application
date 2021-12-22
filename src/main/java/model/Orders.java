package model;

import java.util.Date;
import java.util.List;

public class Orders {
	private int orderId;
	private float price; // total amount of order
	private int status;
	private Date orderDate;
	private String address; // buyer's address
	private String phoneNumber;
	private String userEmail;// buyer's email
	private List<ProductOrders> lp;
	private Date receivedDate;
	private String discount;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	public Orders(int orderId, float price, int status, Date orderDate, String address, String phoneNumber,
			String userEmail, List<ProductOrders> lp, Date receivedDate, String discount) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.status = status;
		this.orderDate = orderDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.userEmail = userEmail;
		this.lp = lp;
		this.receivedDate = receivedDate;
		this.discount = discount;
	}
	
	public Orders(String userEmail, int status, String discount, String address, String phoneNumber,
			Date receivedDate) {
		super();
		this.userEmail = userEmail;
		this.status = status;
		this.discount = discount;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.receivedDate = receivedDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<ProductOrders> getLp() {
		return lp;
	}

	public void setLp(List<ProductOrders> lp) {
		this.lp = lp;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
}