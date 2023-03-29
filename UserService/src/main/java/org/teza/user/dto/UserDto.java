package org.teza.user.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.Basic;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class UserDto {
    private String fname;
    private String lname;
    private String email;
    private String password;
    @Basic
    @Nullable
    @Temporal(TemporalType.TIME)
    private java.util.Date updatedAt;
}
