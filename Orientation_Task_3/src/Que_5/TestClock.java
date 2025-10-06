package Que_5;

// TestClock.java
public class TestClock {
    public static void main(String[] args) {
        // Access the singleton instance
        Clock clock = Clock.getInstance();

        // Check initial time
        System.out.println("Initial Time: " + clock.getTime());

        // Set time manually
        clock.setTime(10.5);
        System.out.println("Time after setting: " + clock.getTime());

        // Advance time
        clock.advanceTime(5.0);
        System.out.println("Time after advancing: " + clock.getTime());

        // Access the clock again through another reference
        Clock anotherClock = Clock.getInstance();
        System.out.println("Accessing through another reference: " + anotherClock.getTime());

        // Confirm that both references point to the same instance
        System.out.println("Same instance? " + (clock == anotherClock));
    }
}
