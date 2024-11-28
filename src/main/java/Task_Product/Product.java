package Task_Product;

import java.util.Objects;

public class Product implements Cloneable {

    private String name;
    private double price;
    private int id;

    public Product() {
    }


    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    protected Product clone(){
          try {
              return (Product) super.clone();
              //try/catch предложен IDE автоматически
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(o.getClass() != getClass() || o == null) return false;
        Product product = new Product();
        return id == product.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
