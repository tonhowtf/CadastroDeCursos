package wtf.tonho.CadastroDeCursos.Professores;

import org.springframework.stereotype.Service;
import wtf.tonho.CadastroDeCursos.Cursos.CursoModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessoresService {

    private ProfessoresRepository professoresRepository;

    public ProfessoresService(ProfessoresRepository professoresRepository) {
        this.professoresRepository = professoresRepository;
    }

    public ProfessoresModel criarProfessor(ProfessoresModel professor){
        return professoresRepository.save(professor);
    }

    public List<ProfessoresModel> listarProfessores(){
        return professoresRepository.findAll();
    }


    public ProfessoresModel listarProfessoresPorId(Long id){
        Optional<ProfessoresModel> professorPorId = professoresRepository.findById(id);
        return professorPorId.orElse(null);
    }

    public ProfessoresModel alterarProfessorPorId(ProfessoresModel professor, Long id) {
        if(professoresRepository.existsById(id)){
            professor.setId(id);
            return professoresRepository.save(professor);
        }
        return null;
    }

    public void deletarProfessorPorId(Long id) {
        professoresRepository.deleteById(id);
    }


}
