package wtf.tonho.CadastroDeCursos.Professores;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {

    @PostMapping("/criar")
    public String criarProfessor() {
        return "Criado com sucesso";
    }

    @GetMapping("/listar")
    public String listarProfessores() {
        return "Lista de professores";
    }

    @GetMapping("/listarID")
    public String professoresPorId() {
        return "Lista de professores";
    }

    @PutMapping("/alterarID")
    public String alterarProfessorPorID() {
        return "Alterado com sucesso";
    }

    @DeleteMapping("/deletarID")
    public String deletarProfessorPorID() {
        return "Deletado com sucesso";
    }


}
