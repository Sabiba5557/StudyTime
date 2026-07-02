package com.StudyTime.app.models;

import java.util.Set;

//import jakarta.annotation.Generated;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
//import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private Long id;
    
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Hall_Name", nullable = false)
    private String hallName;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Batch", nullable = false)
    private int batch;

    @Column(name = "Dept_Name", nullable = false)
    private String deptName;

    @Column(name = "Room_No", nullable = false)
    private int roomNumber;

    @ElementCollection
    @CollectionTable(
        name = "S_Phone",
        joinColumns = { @JoinColumn(name = "Student_Id") }
    )
    @Column(name = "Phone_no")
    private Set<String> phoneNumbers;
}
