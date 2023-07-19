package ias.IASFC.playerService;


import ias.IASFC.PlayerRepository.PlayerRepository;
import ias.IASFC.playerModels.Player;
import ias.IASFC.playerModels.Rol;
import ias.IASFC.playerDTO.PlayerRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class PlayerServiceImplements implements PlayerService {

    private PlayerRepository playerRepository;

    public PlayerServiceImplements(PlayerRepository playerRepository) {
        super();
        this.playerRepository = playerRepository;
    }

    @Override
    public Player save(PlayerRegisterDTO playerRegisterDTO) {
        Player player = new Player(playerRegisterDTO.getNombre(),playerRegisterDTO.getApellido(),
                playerRegisterDTO.getPosicionDeJuego(),playerRegisterDTO.getEmail(),playerRegisterDTO.getContraseña(),
                Arrays.asList(new Rol("ROLE_USER")));
        return  playerRepository.save(player);
    }

    @Override
    public Optional<PlayerRegisterDTO> getPlayer() {
        return Optional.empty();
    }

    @Override
    public Player upDate(PlayerRegisterDTO playerRegisterDTO) {
        return null;
    }

    @Override
    public Optional<PlayerRegisterDTO> delete() {
        return Optional.empty();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Player player1 = playerRepository.findbyEmail(username);
        if(player1 == null){
            throw new UsernameNotFoundException("Jugador o Password Invalidos");
        }

        return  new User(player1.getEmail(), player1.getContraseña(), mapearAutoridadesRoles(player1.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
        return  roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }


}
