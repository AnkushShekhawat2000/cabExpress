package com.example.CapExpress.controller;


import com.example.CapExpress.dto.request.CouponRequest;
import com.example.CapExpress.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/coupon")
public class CouponController {

    @Autowired
    CouponService couponService;

    @GetMapping
    public ResponseEntity addCoupan(@RequestBody CouponRequest couponRequest){
      String response = couponService.addCoupan(couponRequest);

      return new ResponseEntity(response, HttpStatus.CREATED);

    }
}
