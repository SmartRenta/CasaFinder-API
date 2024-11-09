package com.smart_renta.casa_finder.dto.user;

import com.smart_renta.casa_finder.model.UserType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class UserDTO {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private Number phone;

    @Getter
    @Setter
    private LocalDateTime registrationDate;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String facebookUserName;

    @Getter
    @Setter
    private String instagramUserName;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private UserType userType;


    // Constructors

    public UserDTO() {
    }

    public UserDTO(String name, String lastName, String description, Number phone, LocalDateTime registrationDate, String email, String facebookUserName, String instagramUserName, UserType userType) {
        this.name = name;
        this.lastName = lastName;
        this.description = description;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.email = email;
        this.facebookUserName = facebookUserName;
        this.instagramUserName = instagramUserName;
        this.userType = userType;
    }
}
