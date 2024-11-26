package com.example.CapExpress.repository;

import com.example.CapExpress.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {

}
