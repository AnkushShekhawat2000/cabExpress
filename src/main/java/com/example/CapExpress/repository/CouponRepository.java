package com.example.CapExpress.repository;

import com.example.CapExpress.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
