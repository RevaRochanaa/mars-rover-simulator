// Class representing a Pizza
class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    public void setSize(String size) { this.size = size; }
    public void setCheese(boolean cheese) { this.cheese = cheese; }
    public void setPepperoni(boolean pepperoni) { this.pepperoni = pepperoni; }
    public void setMushrooms(boolean mushrooms) { this.mushrooms = mushrooms; }

    @Override
    public String toString() {
        return size + " pizza with " + 
               (cheese ? "cheese, " : "") +
               (pepperoni ? "pepperoni, " : "") +
               (mushrooms ? "mushrooms" : "");
    }
}

// Builder class for creating a Pizza
class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder size(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder cheese(boolean cheese) {
        pizza.setCheese(cheese);
        return this;
    }

    public PizzaBuilder pepperoni(boolean pepperoni) {
        pizza.setPepperoni(pepperoni);
        return this;
    }

    public PizzaBuilder mushrooms(boolean mushrooms) {
        pizza.setMushrooms(mushrooms);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}

// Main class to demonstrate the Builder Pattern
public class Builder {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
            .size("Large")
            .cheese(true)
            .pepperoni(true)
            .mushrooms(false)
            .build();

        System.out.println(pizza);
    }
}