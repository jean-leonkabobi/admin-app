package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produit {
    private int id;
    @NotNull
    private String nom;
    @NotNull (message = "Le nom ne doit pas être nul")
    private double qtStock;
}
