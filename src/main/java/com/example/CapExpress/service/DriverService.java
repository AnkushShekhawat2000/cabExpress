package com.example.CapExpress.service;

import com.example.CapExpress.dto.request.DriverRequest;
import com.example.CapExpress.dto.response.DriverResponse;
import com.example.CapExpress.exception.DriverNotFoundException;
import com.example.CapExpress.model.Driver;
import com.example.CapExpress.repository.DriverRepository;
import com.example.CapExpress.transformer.DriverTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService {


    @Autowired
    DriverRepository driverRepository;



    public DriverResponse addDriver(DriverRequest driverRequest) {

      // requestDto to entity
      Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);

      Driver savedDriver = driverRepository.save(driver);
        
        // entity -> response dto
      return DriverTransformer.driverToDriverResponse(savedDriver);


    }



    public DriverResponse getDriver(int driverId){
        Optional<Driver> optionalDriver = driverRepository.findById(driverId);

        if(optionalDriver.isEmpty()){
            throw new DriverNotFoundException("Invalid driver id");
        }

        Driver driver =  optionalDriver.get();

        return DriverTransformer.driverToDriverResponse(driver);
    }



    public DriverResponse getByMobNo(long mobile){

      Driver driver = driverRepository.findByMobNo(mobile);

      if(ObjectUtils.isEmpty(driver)){
          throw new DriverNotFoundException("Invalid mobile no");
      }

      return DriverTransformer.driverToDriverResponse(driver);

    }

    public List<DriverResponse> getDriverByAgeAndName(int age, String name) {

        List<Driver> drivers = driverRepository.findByAgeAndName(age, name);

        List<DriverResponse> driverResponses = new ArrayList<>();
        for(Driver driver : drivers){
            driverResponses.add(DriverTransformer.driverToDriverResponse(driver));
        }


      return driverResponses;

    }




}
