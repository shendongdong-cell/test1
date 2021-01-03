package Bean;

public class Army {
      private String name;
      private String price;
      private String seller;
	  public Army() {
		super();
		// TODO Auto-generated constructor stub
	  }
	  
	public Army(String name, String price, String seller) {
		super();
		this.name = name;
		this.price = price;
		this.seller = seller;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
      
}
