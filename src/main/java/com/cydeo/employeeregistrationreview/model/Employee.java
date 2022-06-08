package com.cydeo.employeeregistrationreview.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Getter
@Setter
public class Employee {

   // @NotNull   //except null, anything can be accepted--->  //null --- > @NotNull does not accept null but accepts ------> ""
   // @NotEmpty   //except null and empty String anything can be accepted ----- > //null, "" ---- > @NotEmpty does not accept these 2, but accepts space -----> " "
   // @NotBlank   //except null, empty String and only space, anything can be accepted ----------> //" ", "", null --- > @NotBlank does not accept all 3, but accepts any character -----------> a..z

    @NotBlank     //(message="error message") --- > this way error message will show up in console only.
    @Size(max=12, min=2)
    private String firstName;

    @NotBlank
    @Size(max=12, min=2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
