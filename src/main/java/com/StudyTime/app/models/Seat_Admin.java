package com.StudyTime.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Seat_Admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatAdmin {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "Seat_Admin_Id")
   private Long id;  

   @ManyToOne
   @JoinColumn(name = "Seat_no", nullable = false)
   private Seat seat;

   @ManyToOne
   @JoinColumn(name = "Admin_Id", nullable = false)
   private Administrator admin;
}
