package wtf.tonho.CadastroDeCursos.Professores;

import org.springframework.web.bind.annotation.*;
import wtf.tonho.CadastroDeCursos.Cursos.CursoModel;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {

    private final ProfessoresRepository professoresRepository;
    private ProfessoresService professoresService;

    public ProfessoresController(ProfessoresService professoresService, ProfessoresRepository professoresRepository) {
        this.professoresService = professoresService;
        this.professoresRepository = professoresRepository;
    }

    @PostMapping("/criar")
    public ProfessoresModel criarProfessor(@RequestBody ProfessoresModel professor) {
        return professoresRepository.save(professor);
    }

    @GetMapping("/listar")
    public List<ProfessoresModel> listarProfessores() {
        return professoresService.listarProfessores();
    }

    @GetMapping("/listar/{id}")
    public ProfessoresModel professoresPorId(@PathVariable Long id) {
        return professoresService.listarProfessoresPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public ProfessoresModel alterarProfessorPorId(@PathVariable Long id, @RequestBody ProfessoresModel professor) {
        return professoresService.alterarProfessorPorId(professor, id);
    }
    @DeleteMapping("/deletar/{id}")
    public void deletarProfessorPorID(@PathVariable Long id) {
          professoresRepository.deleteById(id);
    }


}
