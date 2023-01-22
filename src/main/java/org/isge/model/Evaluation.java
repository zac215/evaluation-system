package org.isge.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column
    private Integer note;

    @Column
    private String utilisateur;

    @Column
    private LocalDate date;

    @ManyToOne
    private Critere critere;

    @PrePersist
    public void setup() {
        this.date = LocalDate.now();
    }

}