package com.company;

public class Customer {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String secondaryEmail;
    private final String primaryMobileNumber;
    private final String secondaryMobileNumber;

    public Customer(ConcreteCustomerBuilder concreteCustomerBuilder) {
        this.firstName = concreteCustomerBuilder.getFirstName();
        this.middleName = concreteCustomerBuilder.getMiddleName();
        this.lastName = concreteCustomerBuilder.getLastName();
        this.primaryEmail = concreteCustomerBuilder.getPrimaryEmail();
        this.secondaryEmail = concreteCustomerBuilder.getSecondaryEmail();
        this.primaryMobileNumber = concreteCustomerBuilder.getPrimaryMobileNumber();
        this.secondaryMobileNumber = concreteCustomerBuilder.getSecondaryMobileNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\n" +
                "Middle Name: " + middleName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Primary Email: " + primaryEmail + "\n" +
                "Secondary Email: " + secondaryEmail + "\n" +
                "Primary Mobile Number: " + primaryMobileNumber + "\n" +
                "Secondary Mobile Number: " + secondaryMobileNumber + "\n";
    }
}
