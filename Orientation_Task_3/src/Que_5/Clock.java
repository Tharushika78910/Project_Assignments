package Que_5;

// Clock.java
public class Clock {
    // Static instance (only one clock in the simulation)
    private static Clock instance;

    // Simulation time
    private double time;

    // Private constructor to prevent external instantiation
    private Clock() {
        this.time = 0.0; // start at 0
    }

    // Public method to access the single instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Method to set the time
    public void setTime(double newTime) {
        this.time = newTime;
    }

    // Method to get the current time
    public double getTime() {
        return this.time;
    }

    // Method to advance the clock by a given step
    public void advanceTime(double step) {
        this.time += step;
    }
}
