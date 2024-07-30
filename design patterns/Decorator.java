// Coffee interface
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Coffee
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple coffee";
    }

    public double getCost() {
        return 1.0;
    }
}

// Abstract Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

// Concrete Decorator for Milk
class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }
}

// Concrete Decorator for Sugar
class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }
}

// Main class to demonstrate usage
public class Decorator {
    public static void main(String[] args) {
        // Base coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " - $" + simpleCoffee.getCost());

        // Coffee with milk
        Coffee coffeeWithMilk = new Milk(simpleCoffee);
        System.out.println(coffeeWithMilk.getDescription() + " - $" + coffeeWithMilk.getCost());

        // Coffee with milk and sugar
        Coffee coffeeWithMilkAndSugar = new Sugar(new Milk(simpleCoffee));
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " - $" + coffeeWithMilkAndSugar.getCost());
    }
}