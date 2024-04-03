package main.java.com.example;

@Entity
public class Orders {
    @Id
    int oId;
    String item;
    int price;
    @ManyToOne
    Customer customer;
    public Orders(){
        super();
    }    
    public Orders(int oId, String item, int price, Customer customer){
        super();
        this.oId = oId;
        this.item = item;
        this.price = price;
        this.customer = customer;    
    }
    public int getoId() {
        return oId;
    }
    public void setoId(int oId) {
        this.oId = oId;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }    
}
