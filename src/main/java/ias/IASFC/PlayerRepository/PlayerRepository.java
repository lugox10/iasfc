package ias.IASFC.PlayerRepository;

import ias.IASFC.playerModels.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    public Player findByEmail(String email);
}