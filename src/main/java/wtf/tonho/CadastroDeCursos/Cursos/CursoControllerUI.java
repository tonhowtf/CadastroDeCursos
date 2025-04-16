package wtf.tonho.CadastroDeCursos.Cursos;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cursos/ui")
public class CursoControllerUI {

    private final CursoService cursoService;

    public CursoControllerUI(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/listar")
    public String listarCursos(Model model) {
        List<CursoDTO> cursos = cursoService.listarCursos();
        model.addAttribute("cursos", cursos);
        return "listarCursos";
    }

    @GetMapping("/deletar/{id}")
    public String deletarCurso(@PathVariable Long id) {
        cursoService.deletarCursoPorId(id);
        return "redirect:/cursos/ui/listar";

    }

    @GetMapping("/listar/{id}")
    public String listarCursoPorId(@PathVariable Long id, Model model) {
        CursoDTO curso = cursoService.listarCursoPorId(id);
        if (curso != null) {
            model.addAttribute("curso", curso);
            return "Detalhes cursos";
        } else {
            model.addAttribute("Mensagem", "Não encontrado");
            return "Detalhes do curso";
        }
    }
}
