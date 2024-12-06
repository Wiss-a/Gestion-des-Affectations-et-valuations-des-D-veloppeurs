package ma.ac.uir.tp7_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

}