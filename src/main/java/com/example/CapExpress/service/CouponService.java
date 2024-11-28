package com.example.CapExpress.service;

import com.example.CapExpress.dto.request.CouponRequest;
import com.example.CapExpress.model.Coupon;
import com.example.CapExpress.repository.CouponRepository;
import com.example.CapExpress.transformer.CouponTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @Autowired
    CouponRepository couponRepository;

    public String addCoupan(CouponRequest couponRequest){

        System.out.print("kya value aye coupan ki"+ couponRequest.getPercentageDiscount());

        Coupon coupon = CouponTransformer.couponRequestToCoupon(couponRequest);
        couponRepository.save(coupon);

        return "Copon added suceesfully";


    }

}
