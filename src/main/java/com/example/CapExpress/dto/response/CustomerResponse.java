package com.example.CapExpress.dto.response;

import com.example.CapExpress.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CustomerResponse {

    String name;

    String emailId;

    Gender gender;

    Date registeredOn;
}
