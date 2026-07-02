package com.StudyTime.app.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "Admin_Borrow_Record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminBorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Record_Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Admin_Id", nullable = false)
    private Administrator admin;
    @ManyToOne
    @JoinColumn(name = "Borrow_Id", nullable = false)
    private BorrowRecord borrowRecord;
}
