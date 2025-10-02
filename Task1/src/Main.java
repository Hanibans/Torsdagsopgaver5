import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Joshua","Calba","Joshi"));
        customers.add(new Customer("Hannah","Concillado","Hanibans"));
        customers.add(new Customer("Timothy","Calba","thrwingpnuts"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers){
            System.out.println(c);
        }
    }
}
