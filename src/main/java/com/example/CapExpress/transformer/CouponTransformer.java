package com.example.CapExpress.transformer;

import com.example.CapExpress.dto.request.CouponRequest;
import com.example.CapExpress.model.Coupon;

public class CouponTransformer {

    public static Coupon couponRequestToCoupon(CouponRequest couponRequest){

        return Coupon.builder()
                .couponCode(couponRequest.getCouponCode())
                .percentageDiscount(couponRequest.getPercentageDiscount())
                .build();
    }
}
