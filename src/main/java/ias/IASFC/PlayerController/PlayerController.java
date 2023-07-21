package ias.IASFC.PlayerController;


import ias.IASFC.playerDTO.PlayerRegisterDTO;
import ias.IASFC.playerService.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/registro")
public class PlayerController {

@Autowired
     private final PlayerService playerService;



    @ModelAttribute("jugador")
    public PlayerRegisterDTO returnNewPlayerRegisterDTO() {
        return new PlayerRegisterDTO();
    }

    @GetMapping
    public String formRegister() {
        return "registro";
    }

    @PostMapping
    public String registerPlayer(@ModelAttribute("player") PlayerRegisterDTO playerRegisterDTO) {
        playerService.save(playerRegisterDTO);
        return "redirect:/registro?exito";
    }


}
