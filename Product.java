package Domen;

public class Product {
    private String name;
    private int price;

    
    public Product(String name, int price) {
        this.name = name;

        if (price > 0){
           this.price = price; 
        }
        else
        {
            this.price = 10;

        }
        
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product: price = "+ this.price+"; name = "+this.name;
    }

    
}
