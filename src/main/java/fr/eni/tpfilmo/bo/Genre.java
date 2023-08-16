package fr.eni.tpfilmo.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genre implements Serializable {

    @Serial
    private static final long serialVersionUID = 5759658086029363681L;

    private  Long id;
    private String libelle;
}
