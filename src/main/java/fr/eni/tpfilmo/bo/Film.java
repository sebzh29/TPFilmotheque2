package fr.eni.tpfilmo.bo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {

    @Serial
    private static final long serialVersionUID = 4164996659076480900L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String titre;
    private  int annee;
    private  int duree;
    private String synopsis;


    private Genre genre;

    @OneToMany(mappedBy = "")
    private Participant realisateur;

    private List<Participant> acteurs;

    private List<Avis> avis;


}
