package com.StudyTime.app.models;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "Administrator")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admin_Id", nullable = false)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Password", nullable = false)
    private String password;

    @ElementCollection
    @CollectionTable(
        name = "A_Phone",
        joinColumns = { @JoinColumn(name = "Admin_Id") }
    )
    @Column(name = "Phone_no")
    private Set<String> phoneNumbers;
}
