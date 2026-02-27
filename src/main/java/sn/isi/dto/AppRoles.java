package sn.isi.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRoles {
    private int id;
    @NotNull (message = "Le nom ne doit pas être nul")
   private String nom;

}
