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
    public CursoDTO criarCurso(@RequestBody CursoDTO cursoDTO){
        return cursoService.criarCurso(cursoDTO);
    }

    // Mostrar todos os Cursos (read)
    @GetMapping("/listar")
    public List<CursoDTO> listarCursos() {
        return cursoService.listarCursos();
    }
    // Procurar Curso por ID (Read)
    @GetMapping("/listar/{id}")
    public CursoDTO listarCursoPorId(@PathVariable Long id) {
        return cursoService.listarCursoPorId(id);
    }
    // Alterar dados dos Cursos (UPDATE)
    @PutMapping("/alterar/{id}")
    public CursoDTO alterarCursoPorID(@PathVariable Long id, @RequestBody CursoDTO curso) {
        return cursoService.alterarCursoPorId(id, curso);
    }
    // Deletar Curso (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarCursoPorId(@PathVariable Long id) {
        cursoService.deletarCursoPorId(id);
    }
}
