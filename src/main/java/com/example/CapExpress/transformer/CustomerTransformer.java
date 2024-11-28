package com.example.CapExpress.transformer;


import com.example.CapExpress.dto.request.CustomerRequest;
import com.example.CapExpress.dto.response.CustomerResponse;
import com.example.CapExpress.model.Customer;

public class CustomerTransformer {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .emailId(customerRequest.getEmailId())
                .gender(customerRequest.getGender())
                .build();

    }



    public static CustomerResponse CustomerToCustomerResponse(Customer customer){



        return CustomerResponse.builder()
                .name(customer.getName())
                .emailId(customer.getEmailId())
                .gender(customer.getGender())
                .registeredOn(customer.getRegisterOn())
                .build();
    }
}
