package pl.sda.zamowienia;

import jdk.jfr.Category;

import java.awt.color.ProfileDataException;
import java.io.IOException;

public class Product {
    String name;
    double price;
    Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product () {
    }

    public String getName () {
        return name;
    }

    public void setName(String name) throws IOException {
        if (name.equals(name.toUpperCase())) {
            this.name = name;
        }
        else {
            throw new IOException("Tylko wielkie litery proszę!");
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) throws PriceException {
        if(PriceIsPositive(price)) {
            this.price = price;
        }
        else {
            throw new PriceException("Cena musi być większa od 9")
        }
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean PriceIsPositive(double price) {
        if (price>0.0) {
            return true;
        }
        else {
            return false;
        }
    }
}

/*


    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean PriceIsPositive(double price){
        if(price>0.0){
            return true;
        }
        else{
            return false;
        }
    }
} */
