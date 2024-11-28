package com.example.CapExpress.controller;

import com.example.CapExpress.Enum.Gender;
import com.example.CapExpress.dto.request.CustomerRequest;
import com.example.CapExpress.dto.response.CustomerResponse;
import com.example.CapExpress.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){

        try {

            CustomerResponse customerResponse = customerService.addCustomer(customerRequest);
            return new ResponseEntity(customerResponse, HttpStatus.CREATED);

        } catch (Exception e) {

           return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/gender/{gender}/age/{age}")
    public ResponseEntity getByGenderAgeGreaterThan(@PathVariable Gender gender,
                                                    @PathVariable int age){

        List<CustomerResponse> customerResponses = customerService.getByGenderAgeGreaterThan(gender, age);

        return new ResponseEntity(customerResponses, HttpStatus.ACCEPTED);

    }



    // get all customer of a particular gender

    // get all the customers pf a particular gender who registered after a particular date

    // get all the cutomers between a particular age (25 - 40)

    // get customers with highest number of bookings

    // get the customers with lowest number of booking





}
