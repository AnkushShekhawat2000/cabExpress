package com.example.CapExpress.repository;


import com.example.CapExpress.Enum.Gender;
import com.example.CapExpress.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

//    @Query(value = "select * from customer where gender = :gender and age >= :age", nativeQuery = true)
//    List<Customer> getByGenderAgeGreaterThan(String gender, int age);

    // hql querry (java querry)
    @Query(value = "select c from Customer c where c.gender = :gender and c.age >= :age")
    List<Customer> getByGenderAgeGreaterThan(Gender gender, int age);
}
