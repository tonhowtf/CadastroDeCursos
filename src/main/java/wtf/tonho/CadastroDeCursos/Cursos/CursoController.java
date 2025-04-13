package wtf.tonho.CadastroDeCursos.Cursos;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class CursoController {

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
    @GetMapping("/todos")
    public String listarCursos() {
        return "Lista de cursos";
    }
    // Procurar Curso por ID (Read)
    @GetMapping("/todosID")
    public String cursoPorId() {
        return "Lista de cursos";
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
