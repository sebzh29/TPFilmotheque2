package fr.eni.tpfilmo.bo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participant implements Serializable {

    @Serial
    private static final long serialVersionUID = 6147260070785902162L;

    private Long id;
    private String prenom;
    private String nom;

}
