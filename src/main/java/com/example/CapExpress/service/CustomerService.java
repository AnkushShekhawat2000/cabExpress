package com.example.CapExpress.service;


import com.example.CapExpress.Enum.Gender;
import com.example.CapExpress.dto.request.CustomerRequest;
import com.example.CapExpress.dto.response.CustomerResponse;
import com.example.CapExpress.model.Customer;
import com.example.CapExpress.repository.CustomerRepository;
import com.example.CapExpress.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);



        Customer savedCustomer = customerRepository.save(customer);

        return CustomerTransformer.CustomerToCustomerResponse(savedCustomer);

    }

    public List<CustomerResponse> getByGenderAgeGreaterThan(Gender gender, int age) {
      List<Customer> customers = customerRepository.getByGenderAgeGreaterThan(gender, age);
      List<CustomerResponse> customerResponses = new ArrayList<>();

      for(Customer customer : customers){
          customerResponses.add(CustomerTransformer.CustomerToCustomerResponse(customer));
      }

      return customerResponses;

    }
}
