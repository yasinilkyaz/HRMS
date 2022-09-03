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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id")
public class Candidate extends User {
    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "birth_year")
    private int birthYear;
}
