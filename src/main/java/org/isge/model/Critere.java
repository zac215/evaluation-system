package org.isge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "critere")
public class Critere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(unique = true)
    private String designation;

    @OneToMany(mappedBy = "critere", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Evaluation> listeEvaluation  = new ArrayList<>();

    @Column
    private LocalDate date;

    @PrePersist
    public void setup() {
        this.date = LocalDate.now();
    }
}