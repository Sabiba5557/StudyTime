package com.StudyTime.app.models;

//import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Reservation_Admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reservation_Admin_Id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Reservation_Id", nullable = false)
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "Admin_Id", nullable = false)
    private Administrator admin;
}
