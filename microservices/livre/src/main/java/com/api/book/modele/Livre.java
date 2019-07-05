package com.api.book.modele;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="livre_id")
    private int livreId;

    @Column(name="nom")
    private String nom;

    @Column(name="description")
    private String description;

    @Column(name="disponibilite")
    private int disponibilite;

    public int getId() {
        return livreId;
    }

    public void setId(int id) {
        this.livreId = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(int disponibilite) {
        this.disponibilite = disponibilite;
    }


    public Livre() {
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + livreId +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", disponibilite=" + disponibilite +
                '}';
    }
}
