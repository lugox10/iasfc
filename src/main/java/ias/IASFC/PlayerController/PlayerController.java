package ias.IASFC.PlayerController;


import ias.IASFC.playerDTO.PlayerRegisterDTO;
import ias.IASFC.playerService.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/registro")
@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @ModelAttribute("player")
    public PlayerRegisterDTO returnNewPlayerRegisterDTO(){
        return new PlayerRegisterDTO();
    }

    @GetMapping
    public String formRegister(){
        return "registro";
    }

    @PostMapping
    public String registerPlayer(@ModelAttribute("player") PlayerRegisterDTO playerRegisterDTO){
        playerService.save(playerRegisterDTO);
        return "redirect:/registro?exito";
    }


}
