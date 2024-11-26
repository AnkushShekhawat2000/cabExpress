package com.example.CapExpress.controller;


import com.example.CapExpress.model.Cab;
import com.example.CapExpress.model.Driver;
import com.example.CapExpress.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/cab")
public class CabController {

        @Autowired
        CabService cabService;


        @PostMapping
       public String addCab(@RequestBody Cab cab){
           return cabService.addCab(cab);
        }






}
