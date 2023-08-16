package fr.eni.tpfilmo.bo;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Membre implements Serializable {

    @Serial
    private static final long serialVersionUID = -6085019137018086193L;

    private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private boolean isAdmin;

    @OneToMany
    private List<Avis> avis;

}
