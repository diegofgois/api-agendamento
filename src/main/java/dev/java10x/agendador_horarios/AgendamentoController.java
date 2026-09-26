package dev.java10x.agendador_horarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AgendamentoController {
    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Está é a minha primeira rota";
    }
}
