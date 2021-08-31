package com.capgemini.capgeminimarket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //path principal
public class HolamundoController {

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola putos en spring!!!";
    }
}
