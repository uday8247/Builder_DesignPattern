package com.company;

public interface CustomerBuilder {
    CustomerBuilder firstName(String firstName);
    CustomerBuilder lastName(String lastName);
    CustomerBuilder middleName(String middleName);
    CustomerBuilder primaryEmail(String primaryEmail);
    CustomerBuilder secondaryEmail(String secondaryEmail);
    CustomerBuilder primaryMobileNumber(String primaryMobileNumber);
    CustomerBuilder secondaryMobileNumber(String secondaryMobileNumber);

    Customer build();
}
