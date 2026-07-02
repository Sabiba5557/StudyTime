package com.StudyTime.app.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "Borrow_Record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Borrow_Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Book_Id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "Student_Id", nullable = false)
    private Student student;

    @Column(name = "Borrow_Date", nullable = false)
    private LocalDateTime borrowDate;


}
