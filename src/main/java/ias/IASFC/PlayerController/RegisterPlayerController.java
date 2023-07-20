package ias.IASFC.PlayerController;

import ias.IASFC.playerModels.Player;
import ias.IASFC.playerService.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterPlayerController {
@Autowired
private PlayerService playerService;
    @GetMapping("/login")
    public  String sesionInit(){
        return "login";
    }

    @GetMapping("/")
    public  String pageInit(Model model){
        model.addAttribute("usuarios",playerService.listPlayers());
        return "index";
    }


}
