// Interface representing different mood states
interface MoodState {
    String getColor();
    String getMoodDescription();
}

// Class for Happy Mood
class HappyMood implements MoodState {
    public String getColor() { return "Pink"; }
    public String getMoodDescription() { return "Joyful and excited"; }
}

// Class for Calm Mood
class CalmMood implements MoodState {
    public String getColor() { return "Blue"; }
    public String getMoodDescription() { return "Relaxed and peaceful"; }
}

// Class for Stressed Mood
class StressedMood implements MoodState {
    public String getColor() { return "Red"; }
    public String getMoodDescription() { return "Tense and anxious"; }
}

// Class for Mood Ring
class MoodRing {
    private MoodState state;

    public void setState(MoodState state) {
        this.state = state;
    }

    public void displayMood() {
        System.out.println("Ring color: " + state.getColor());
        System.out.println("Mood: " + state.getMoodDescription());
    }
}

// Main class to demonstrate the usage of MoodRing and MoodState
public class Behavioral {
    public static void main(String[] args) {
        MoodRing ring = new MoodRing();
        
        // Set mood to Happy and display
        ring.setState(new HappyMood());
        ring.displayMood();
        
        // Set mood to Stressed and display
        ring.setState(new StressedMood());
        ring.displayMood();
    }
}