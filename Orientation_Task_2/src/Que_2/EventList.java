package Que_2;

import java.util.*;

public class EventList {
    private PriorityQueue<Event> queue;

    public EventList() {
        queue = new PriorityQueue<>();
    }

    public void addEvent(Event e) {
        queue.add(e);
    }

    public Event getNextEvent() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printEvents() {
        List<Event> events = new ArrayList<>(queue);
        Collections.sort(events);
        for (Event e : events) {
            System.out.println(e);
        }
    }
}
