public class Customer {
    private int id;
    private long startTime;
    private long endTime;

    private static int idCounter = 0;

    public Customer() {
        idCounter++;
        id = idCounter;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}
