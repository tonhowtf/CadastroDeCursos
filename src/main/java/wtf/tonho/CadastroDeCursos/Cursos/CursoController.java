package wtf.tonho.CadastroDeCursos.Cursos;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cursos")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }


    // Adicionar Curso (Create)
    @PostMapping("/criar")
    public String criarCurso() {
        return "Criado com sucesso";
    }

    // Mostrar todos os Cursos (read)
    @GetMapping("/listar")
    public List<CursoModel> listarCursos() {
        return cursoService.listarCursos();
    }
    // Procurar Curso por ID (Read)
    @GetMapping("/listar/{id}")
    public CursoModel listarCursoPorId(@PathVariable Long id) {
        return cursoService.listarCursoPorId(id);
    }
    // Alterar dados dos Cursos (UPDATE)
    @PutMapping("/alterarID")
    public String alterarCursoPorID() {
        return "Alterado com sucesso";
    }
    // Deletar Curso (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarCursoPorID() {
        return "Deletado com sucesso";
    }
}
