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
public class Participant implements Serializable {

    @Serial
    private static final long serialVersionUID = 6147260070785902162L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;

    @ManyToMany(mappedBy = "acteurs")
    private List<Film> films;

}
