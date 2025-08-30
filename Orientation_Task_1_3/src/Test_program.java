public class Test_program {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setStartTime(10);
        c1.setEndTime(30);
        System.out.println("Customer " + c1.getId() + " spent " + c1.getTimeSpent() + " units of time.");

        Customer c2 = new Customer();
        c2.setStartTime(5);
        c2.setEndTime(12);
        System.out.println("Customer " + c2.getId() + " spent " + c2.getTimeSpent() + " units of time.");

        Customer c3 = new Customer();
        c3.setStartTime(100);
        c3.setEndTime(250);
        System.out.println("Customer " + c3.getId() + " spent " + c3.getTimeSpent() + " units of time.");
    }
}
