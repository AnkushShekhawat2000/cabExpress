package com.example.CapExpress.dto.request;


import com.example.CapExpress.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequest {

    String name;

    int age;


    String emailId;


    Gender gender;
}
