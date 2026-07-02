package com.StudyTime.app.models;

import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BookA")
@SecondaryTable(name = "BookB", pkJoinColumns = @PrimaryKeyJoinColumn(name = "Book_Id"))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Book_Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Hall_Name", nullable = false)
    private Library library;

    // Fields saved into the secondary table (BookB)
    @Column(table = "BookB", name = "Book_name", nullable = false)
    private String bookName;

    @Column(table = "BookB", name = "Book_Availability", nullable = false)
    private boolean bookAvailability;

    @ElementCollection
    @CollectionTable(
        name = "Author",
        joinColumns = { @JoinColumn(name = "Book_Id") }
    )
    @Column(name = "Author_Name")
    private Set<String> authors;
}
