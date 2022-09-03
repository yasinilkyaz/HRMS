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
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id")

public class Employee extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
