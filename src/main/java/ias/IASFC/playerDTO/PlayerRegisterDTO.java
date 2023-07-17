package ias.IASFC.playerDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerRegisterDTO {

    private Long id;
    private String nombre;

    private String apellido;

    private String posicionDeJuego;

    private String email;

    private String contraseña;

    public PlayerRegisterDTO(String email) {
        this.email = email;
    }

    public PlayerRegisterDTO(Long id, String nombre, String apellido, String posicionDeJuego, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicionDeJuego = posicionDeJuego;
        this.email = email;
        this.contraseña = contraseña;
    }

    public PlayerRegisterDTO(String nombre, String apellido, String posicionDeJuego, String email, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicionDeJuego = posicionDeJuego;
        this.email = email;
        this.contraseña = contraseña;
    }

    public PlayerRegisterDTO() {
    }
}
