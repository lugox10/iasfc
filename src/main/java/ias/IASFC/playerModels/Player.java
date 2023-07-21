package ias.IASFC.playerModels;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Collection;
import javax.persistence.*;


@Entity
@Table(name = "player", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "posicionDeJuego")
    private String posicionDeJuego;

    private String email;
    private String contraseña;

    @Column(name = "rol")
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
    private Collection<Rol> roles;

    public Player(String nombre, String apellido, String posicionDeJuego, String email, String contraseña, Collection<Rol> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicionDeJuego = posicionDeJuego;
        this.email = email;
        this.contraseña = contraseña;
        this.roles = roles;
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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    public Player(Long id, String nombre, String apellido, String posicionDeJuego, String email, String contraseña, Collection<Rol> roles) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicionDeJuego = posicionDeJuego;
        this.email = email;
        this.contraseña = contraseña;
        this.roles = roles;
    }

    public Player() {
    }
}
