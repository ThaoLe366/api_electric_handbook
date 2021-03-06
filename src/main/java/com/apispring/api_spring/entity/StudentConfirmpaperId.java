package com.apispring.api_spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentConfirmpaperId implements Serializable {

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "required_time")
    private Date requiredTime;

    @Column(name = "confirmationPaper_id")
    private int confirmationPaperId;


}
