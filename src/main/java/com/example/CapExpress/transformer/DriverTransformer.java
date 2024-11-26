package com.example.CapExpress.transformer;

import com.example.CapExpress.dto.request.DriverRequest;
import com.example.CapExpress.dto.response.DriverResponse;
import com.example.CapExpress.model.Driver;

public class DriverTransformer {

    public static Driver driverRequestToDriver(DriverRequest driverRequest){

      return Driver.builder()
              .age(driverRequest.getAge())
              .name(driverRequest.getName())
              .mobNo(driverRequest.getMobNo())
              .build();

    }


    public static DriverResponse driverToDriverResponse(Driver driver){

//        DriverResponse driverResponse = new DriverResponse();
//        driverResponse.setAge(driver.getAge());
//        driverResponse.setName(driver.getName());
//
//       return driverResponse;


        return DriverResponse.builder()
                .age(driver.getAge())
                .name(driver.getName())
                .build();
    }
}
