package wtf.tonho.CadastroDeCursos.Cursos;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cursos")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }


    @PostMapping("/criar")
    public ResponseEntity<String> criarCurso(@RequestBody CursoDTO curso) {
        CursoDTO cursoDTO = cursoService.criarCurso(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body("Curso criado com sucesso! ID: " + cursoDTO.getId());
    }


    @GetMapping("/listar")
    @Operation(summary = "Listar todos os cursos", description = "Essa rota lista todos os cursos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Cursos listado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro na listagem")
    })
    public ResponseEntity<List<CursoDTO>> listarCursos() {
        List<CursoDTO> cursos = cursoService.listarCursos();
        return ResponseEntity.status(HttpStatus.OK).body(cursos);
    }

    @GetMapping("/listar/{id}")
    @Operation(summary = "Vê informações sobre um curso", description = "Essa rota lista um curso selecionado por id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Curso listado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro na listagem")
    })
    public ResponseEntity<?> listarCursoPorId(@PathVariable Long id) {
        CursoDTO curso = cursoService.listarCursoPorId(id);
        if (curso != null) {
            return ResponseEntity.ok(curso);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso com o id: " + id + " Não existe nos registros");
        }
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarCursoPorID(@PathVariable Long id, @RequestBody CursoDTO cursoAtualizado) {

        CursoDTO curso = cursoService.alterarCursoPorId(id, cursoAtualizado);
        if (curso != null) {
            return ResponseEntity.ok(curso);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso com esse id: " + id + " Não foi encontrado");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarCursoPorId(@PathVariable Long id) {
        if (cursoService.listarCursoPorId(id) != null) {
            cursoService.deletarCursoPorId(id);
            return ResponseEntity.ok("Curso deletado com o ID: " + id + " deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O Curso com id " + id + " não foi encontrado");
        }
    }
}
