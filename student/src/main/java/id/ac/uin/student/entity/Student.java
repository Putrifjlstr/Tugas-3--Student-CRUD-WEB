package id.ac.uin.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty (message = "First name is required")
    @Column (nullable = false, name = "first_name")
    private String firstName;

    @NotEmpty (message = "Last name is required")
    @Column (nullable = false, name = "last_name")
    private String lastName;

    @NotEmpty (message = "email is required")
    @Column (nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty (message = "Phone number is required")
    @Column (nullable = false, name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty (message = "jurusan is required")
    @Column (nullable = false, unique = true)
    private String jurusan;

}
