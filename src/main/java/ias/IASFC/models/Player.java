package ias.IASFC.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "player",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
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
    @Column(name = "email")
    private String email;
    @Column(name = "contraseña")
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

    public Player() {
    }
}
