package com.StudyTime.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student_Admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Admin_Id")
    private Long studentAdminId;

    @ManyToOne
    @JoinColumn(name = "Student_Id", nullable = false)
    private Student student;    

    @ManyToOne
    @JoinColumn(name = "Admin_Id", nullable = false)
    private Administrator admin;
}
