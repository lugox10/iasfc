package ias.IASFC.playerService;

import ias.IASFC.playerModels.Player;
import ias.IASFC.playerDTO.PlayerRegisterDTO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface PlayerService extends UserDetailsService {
    public Player save(PlayerRegisterDTO playerRegisterDTO);
    public Optional<PlayerRegisterDTO> getPlayer();
    public Player upDate(PlayerRegisterDTO playerRegisterDTO);
    public Optional<PlayerRegisterDTO> delete ();

}
