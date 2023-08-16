package fr.eni.tpfilmo.bo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {

    @Serial
    private static final long serialVersionUID = 4164996659076480900L;

    private Long id;
    private  String titre;
    private  int annee;
    private  int duree;
    private String synopsis;

    private Genre genre;

    private Participant realisateur;
    private List<Participant> acteurs;

    private List<Avis> avis;


}
