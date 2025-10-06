package Que_2;

public class TestSimulation {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.DEPARTURE));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(1.0, EventType.ARRIVAL));

        System.out.println("All events in order:");
        eventList.printEvents();

        Event next = eventList.getNextEvent();
        System.out.println("\nNext event to be processed: " + next);

        System.out.println("\nRemaining events in order:");
        eventList.printEvents();
    }
}

