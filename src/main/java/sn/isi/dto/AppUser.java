package sn.isi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    private int id;
    @NotNull (message = "Le nom ne doit pas être nul")
    private String nom;
    @NotNull (message = "Le prenom  ne doit pas être nul")
    private String prenom;
    @NotNull (message = "L'email ne doit pas être nul")
    private String email;
    @NotNull (message = "Le mot de passe ne doit pas être nul")
    private String password;
    @NotNull
    private int etat;
}
