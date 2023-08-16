package fr.eni.tpfilmo.bo;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Avis implements Serializable {

    @Serial
    private static final long serialVersionUID = -3886268592570515699L;

    private Long id;
    private int note;
    private String commentaire;


    private Film film;

    @ManyToOne
    private Membre membre;
}
