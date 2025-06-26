import java.util.*;

public class CustomerInfo {
    public static void main(String[] args) {
        System.out.println("Rohit Lovevanshi, 0873AL231023(AIML)");

        // Creating a list of customers
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", "1234567890", "Texas"));
        customers.add(new Customer("Jane Smith", "0987654321", "California"));
        customers.add(new Customer("Alice Johnson", "5555555555", "Texas"));

        // Displaying customer names and mobile numbers from Texas
        System.out.println("\nCustomers from Texas:");
        for (Customer customer : customers) {
            if ("Texas".equals(customer.getCity())) {
                System.out.println("Name: " + customer.getName() + ", Mobile: " + customer.getMobile());
            }
        }
    }
}

// Definition of the Customer class
class Customer {
    private String name;
    private String mobile;
    private String city;

    // Constructor
    public Customer(String name, String mobile, String city) {
        this.name = name;
        this.mobile = mobile;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCity() {
        return city;
    }
}
