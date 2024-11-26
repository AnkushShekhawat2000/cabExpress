package com.example.CapExpress.model;

import com.example.CapExpress.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @Column(unique = true, nullable=false)
    String emailId;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @CreationTimestamp
    Date registerOn;  // only date


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<Booking> bookings = new ArrayList<>();
}
