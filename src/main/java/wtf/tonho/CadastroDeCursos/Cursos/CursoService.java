package wtf.tonho.CadastroDeCursos.Cursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<CursoModel> listarCursos(){
        return cursoRepository.findAll();
    }


}
