package wtf.tonho.CadastroDeCursos.Cursos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<CursoModel> listarCursos(){
        return cursoRepository.findAll();
    }

    public CursoModel listarCursoPorId(Long id){
        Optional<CursoModel> cursoPorId = cursoRepository.findById(id);
        return cursoPorId.orElse(null);
    }

    public CursoModel criarCurso(CursoModel curso){
        return cursoRepository.save(curso);
    }

    public void deletarCursoPorId(Long id){
        cursoRepository.deleteById(id);
    }

}
