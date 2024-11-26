package com.example.CapExpress.controller;


import com.example.CapExpress.dto.request.DriverRequest;
import com.example.CapExpress.dto.response.DriverResponse;
import com.example.CapExpress.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/driver")
public class DriverController {

    @Autowired
    DriverService driverService;


    @PostMapping
    public ResponseEntity addDriver(@RequestBody DriverRequest driverRequest){

        DriverResponse driverResponse =  driverService.addDriver(driverRequest);

        return new ResponseEntity(driverResponse, HttpStatus.CREATED);
    }



    @GetMapping
    public DriverResponse getDriver(@RequestParam("driverId") int driverId){
        return driverService.getDriver(driverId);
    }


    @GetMapping("/mobile/{mobile}")
    public DriverResponse getByMobNo(@PathVariable("mobile") long mobile){
        return driverService.getByMobNo(mobile);
    }


    @GetMapping("/age-and-name")
    public List<DriverResponse> getDriverByAgeAndName(@RequestParam("age") int age, @RequestParam("name") String name){

        return driverService.getDriverByAgeAndName(age, name);
    }
}
 