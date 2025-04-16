package wtf.tonho.CadastroDeCursos.Cursos;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;
    private final CursoMapper cursoMapper;

    public CursoService(CursoRepository cursoRepository, CursoMapper cursoMapper) {
        this.cursoRepository = cursoRepository;
        this.cursoMapper = cursoMapper;
    }

    public List<CursoDTO> listarCursos(){
       List<CursoModel> cursos = cursoRepository.findAll();
       return cursos.stream().map(cursoMapper::map).collect(Collectors.toList());
    }

    public CursoDTO listarCursoPorId(Long id){
        Optional<CursoModel> cursoPorId = cursoRepository.findById(id);
        return cursoPorId.map(cursoMapper::map).orElse(null);
    }

    public CursoDTO criarCurso(CursoDTO cursoDTO){
        CursoModel curso = cursoMapper.map(cursoDTO);
        cursoRepository.save(curso);
        return cursoMapper.map(curso);
    }

    public void deletarCursoPorId(Long id){
        cursoRepository.deleteById(id);
    }

    public CursoDTO alterarCursoPorId(Long id, CursoDTO cursoDTO){
        Optional<CursoModel> cursoExistente = cursoRepository.findById(id);
        if (cursoExistente.isPresent()) {
            CursoModel cursoAtualizado = cursoMapper.map(cursoDTO);
            cursoAtualizado.setId(id);
            CursoModel cursoSalvo = cursoRepository.save(cursoAtualizado);
            return cursoMapper.map(cursoSalvo);
        }
        return null;
    }

}
