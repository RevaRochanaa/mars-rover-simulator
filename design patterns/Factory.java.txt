// Interface for Emoji
interface Emoji {
    void display();
}

// Concrete class for HappyEmoji
class HappyEmoji implements Emoji {
    public void display() {
        System.out.println("😊");
    }
}

// Concrete class for SadEmoji
class SadEmoji implements Emoji {
    public void display() {
        System.out.println("😢");
    }
}

// Concrete class for SurprisedEmoji
class SurprisedEmoji implements Emoji {
    public void display() {
        System.out.println("😮");
    }
}

// Abstract class for EmojiCreator
abstract class EmojiCreator {
    abstract Emoji createEmoji();

    public void showEmoji() {
        Emoji emoji = createEmoji();
        emoji.display();
    }
}

// Concrete Creator for HappyEmoji
class HappyEmojiCreator extends EmojiCreator {
    Emoji createEmoji() {
        return new HappyEmoji();
    }
}

// Concrete Creator for SadEmoji
class SadEmojiCreator extends EmojiCreator {
    Emoji createEmoji() {
        return new SadEmoji();
    }
}

// Main class to demonstrate the Factory Method Pattern
public class Factory {
    public static void main(String[] args) {
        EmojiCreator happyCreator = new HappyEmojiCreator();
        happyCreator.showEmoji();  // Output: 😊

        EmojiCreator sadCreator = new SadEmojiCreator();
        sadCreator.showEmoji();  // Output: 😢
    }
}