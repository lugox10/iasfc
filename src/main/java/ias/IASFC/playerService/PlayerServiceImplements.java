package ias.IASFC.playerService;


import ias.IASFC.PlayerRepository.PlayerRepository;
import ias.IASFC.models.Player;
import ias.IASFC.models.Rol;
import ias.IASFC.playerDTO.PlayerRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;


@Service
public class PlayerServiceImplements implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player save(PlayerRegisterDTO playerRegisterDTO) {
        Player player = new Player(playerRegisterDTO.getNombre(),playerRegisterDTO.getApellido(),playerRegisterDTO.getPosicionDeJuego(),playerRegisterDTO.getEmail(),playerRegisterDTO.getContraseña(), Arrays.asList(new Rol("ROLE_USER")));
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
}
