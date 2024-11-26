package com.example.CapExpress.repository;


import com.example.CapExpress.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    Driver findByMobNo(long mobNo);

    List<Driver> findByAgeAndName(int age, String name);


}
