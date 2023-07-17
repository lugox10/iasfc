package ias.IASFC.PlayerRepository;

import ias.IASFC.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}