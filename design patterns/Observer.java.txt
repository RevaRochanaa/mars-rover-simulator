import java.util.ArrayList;
import java.util.List;

// Interface for observers
interface PlantObserver {
    void update(String plantName, String condition);
}

// Class for plant owners that implement PlantObserver
class PlantOwner implements PlantObserver {
    private String name;

    public PlantOwner(String name) {
        this.name = name;
    }

    public void update(String plantName, String condition) {
        System.out.println(name + " notified: " + plantName + " is " + condition);
    }
}

// Class representing a plant which notifies observers of its condition
class Plant {
    private List<PlantObserver> observers = new ArrayList<>();
    private String name;
    private String condition;

    public Plant(String name) {
        this.name = name;
    }

    public void addObserver(PlantObserver observer) {
        observers.add(observer);
    }

    public void setCondition(String condition) {
        this.condition = condition;
        notifyObservers();
    }

    private void notifyObservers() {
        for (PlantObserver observer : observers) {
            observer.update(name, condition);
        }
    }
}

// Main class to demonstrate the observer pattern
public class Observer {
    public static void main(String[] args) {
        // Create a plant and observers
        Plant fern = new Plant("Fern");
        fern.addObserver(new PlantOwner("Alice"));
        fern.addObserver(new PlantOwner("Bob"));

        // Change the condition of the plant
        fern.setCondition("needs water");
        fern.setCondition("healthy");
    }
}