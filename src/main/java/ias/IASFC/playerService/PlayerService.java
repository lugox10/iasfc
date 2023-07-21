package ias.IASFC.playerService;

import ias.IASFC.playerModels.Player;
import ias.IASFC.playerDTO.PlayerRegisterDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface PlayerService extends UserDetailsService {
    public Player save(PlayerRegisterDTO playerRegisterDTO);

    public List<Player> listPlayers();


}
