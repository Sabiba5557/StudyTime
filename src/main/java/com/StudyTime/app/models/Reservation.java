package com.StudyTime.app.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reservation_Id")
    private Long id;

    @Column(name = "Booking_Date", nullable = false)
    private LocalDateTime bookingDate;

    @Column(name = "Time_Slot_Starting", nullable = false)
    private LocalDateTime timeSlotStarting;

    @Column(name = "Time_Slot_Ending", nullable = false)
    private LocalDateTime timeSlotEnding;

    @Column(name = "Reservation_Status", nullable = false)
    private String reservationStatus;

    @ManyToOne
    @JoinColumn(name = "Student_Id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Seat_no", nullable = false)
    private Seat seat;

    @PrePersist
    protected void onCreate(){
        this.bookingDate = LocalDateTime.now();
    }
}
