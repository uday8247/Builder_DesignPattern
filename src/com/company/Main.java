package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new ConcreteCustomerBuilder()
                .firstName("Tony")
                .lastName("Stark")
                .primaryEmail("tonystark@abc.com")
                .primaryMobileNumber("1234567890")
                .build();

        System.out.println(customer.toString());
    }
}
