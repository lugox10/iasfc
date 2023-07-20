package ias.IASFC.playerService;

import ias.IASFC.playerModels.Player;
import ias.IASFC.playerDTO.PlayerRegisterDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface PlayerService extends UserDetailsService {
    public Player save(PlayerRegisterDTO playerRegisterDTO);
    public List<Player> listPlayers();


}
