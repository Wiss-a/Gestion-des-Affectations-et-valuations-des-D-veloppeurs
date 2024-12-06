package ma.ac.uir.tp7_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chef")
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nomC")
    private String nom;
    @Column(name="prenomC")
    private String prenom;
    @Column(name = "emailC")
    private String email;
    @Column(name = "passwordC")
    private String password;
}