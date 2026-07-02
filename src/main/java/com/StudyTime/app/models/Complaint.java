package com.StudyTime.app.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Complaint")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Complaint_Id", nullable = false)
    private Long complaintId;

    @Column(name = "Complain_Category", nullable = false)
    private String complainCategory;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Submission_Date", nullable = false)
    private LocalDateTime submissionDate;

    @Column(name = "Status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "Student_Id", nullable = false)
    private Student student;

}
