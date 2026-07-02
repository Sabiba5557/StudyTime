package com.StudyTime.app.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Library")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library {
    @Id
    @Column(name = "Hall_Name", nullable = false)
    private String hallName;

    @Column(name = "Opening_Time", nullable = false)
    private LocalDateTime openingTime;

    @Column(name = "Closing_Time", nullable = false)
    private LocalDateTime closingTime;
}
