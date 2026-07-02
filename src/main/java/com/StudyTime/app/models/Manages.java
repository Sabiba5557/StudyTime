package com.StudyTime.app.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Manages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Manage_Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Admin_Id", nullable = false)
    private Administrator admin;

    @ManyToOne
    @JoinColumn(name = "Hall_Name", nullable = false)
    private Library library;
}
