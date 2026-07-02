package com.StudyTime.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Monitored_By")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonitoredBy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Monitored_By_Id")
    private Long monitoredById;

    @ManyToOne
    @JoinColumn(name = "Complaint_Id", nullable = false)
    private Complaint complain;

    @ManyToOne
    @JoinColumn(name = "Admin_Id", nullable = false)
    private Administrator admin;
}
