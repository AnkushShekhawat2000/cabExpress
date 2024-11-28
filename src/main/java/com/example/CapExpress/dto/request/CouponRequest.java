package com.example.CapExpress.dto.request;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CouponRequest {

    String couponCode;

    double percentageDiscount;
}
