package com.StudyTime.app.models;

//import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Seat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    @Id
    @Column(name = "Seat_no", nullable = false)
    private String seatNo;

    @Column(name = "Availability", nullable = false)
    private boolean availability;

    @Column(name = "Priority_Type", nullable = false)
    private String priorityType;
}
