package day3;

public class Product {
	private int pid;
	private String product_name;
	private float price;
	public Product(){
		//Default Constuctor
		
		this.pid=33;
		this.product_name="Laptop";
		this.price=5000.0f;
	}
	public Product(int id, String name, float pri) {
		//Parameterized Constructor
		this.pid=id;
		this.product_name=name;
		this.price=pri;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", product_name=" + product_name + ", price=" + price + "]";
	}
	
}
