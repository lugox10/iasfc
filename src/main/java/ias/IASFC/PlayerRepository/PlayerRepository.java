package ias.IASFC.PlayerRepository;

import ias.IASFC.playerModels.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    public Player findbyEmail(String email);
}