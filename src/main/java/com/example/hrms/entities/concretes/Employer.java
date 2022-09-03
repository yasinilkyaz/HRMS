package com.example.hrms.entities.concretes;

import com.example.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "id")
@NoArgsConstructor
@AllArgsConstructor

public class Employer extends User {
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "phone_number")
    private String phoneNumber;
}
