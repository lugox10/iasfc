package ias.IASFC.playerService;

import ias.IASFC.models.Player;
import ias.IASFC.playerDTO.PlayerRegisterDTO;
import java.util.Optional;

public interface PlayerService {
    public Player save(PlayerRegisterDTO playerRegisterDTO);
    public Optional<PlayerRegisterDTO> getPlayer();
    public Player upDate(PlayerRegisterDTO playerRegisterDTO);
    public Optional<PlayerRegisterDTO> delete ();

}
