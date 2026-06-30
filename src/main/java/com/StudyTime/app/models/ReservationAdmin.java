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
    @ManyToOne
    @JoinColumn(name = "Reservation_id", nullable = false)
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "Admin_id", nullable = false)
    private Administrator admin;
}
