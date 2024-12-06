package ma.ac.uir.tp7_project.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idprojet;
    @Column(name = "titre")
    private String titre;
    @Column(name = "description")
    private String description;
    @Column(name = "duree")
    private int dureeEstimee; // En jours

    @ElementCollection
    @CollectionTable(name = "projet_competences", joinColumns = @JoinColumn(name = "idprojet"))
    @Column(name = "competence_requise")
    private List<String> competencesRequises;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;
    public Project(String titre, String description, int dureeEstimee, List<String> competencesRequises) {
        this.titre = titre;
        this.description = description;
        this.dureeEstimee = dureeEstimee;
        this.competencesRequises = competencesRequises;
    }

    public Project() {

    }


    public int getIdprojet() {
        return idprojet;
    }

    public void setIdprojet(int idprojet) {
        this.idprojet = idprojet;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(int dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }

    public List<String> getCompetencesRequises() {
        return competencesRequises;
    }

    public void setCompetencesRequises(List<String> competencesRequises) {
        this.competencesRequises = competencesRequises;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "idprojet=" + idprojet +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", dureeEstimee=" + dureeEstimee +
                ", competencesRequises=" + competencesRequises +
                ", employees=" + employees +
                '}';
    }
}

