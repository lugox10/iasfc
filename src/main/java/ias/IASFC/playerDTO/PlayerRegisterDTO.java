package ias.IASFC.playerDTO;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicionDeJuego() {
        return posicionDeJuego;
    }

    public void setPosicionDeJuego(String posicionDeJuego) {
        this.posicionDeJuego = posicionDeJuego;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
