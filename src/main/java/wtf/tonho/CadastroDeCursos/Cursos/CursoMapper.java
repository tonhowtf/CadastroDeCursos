package wtf.tonho.CadastroDeCursos.Cursos;

import org.springframework.stereotype.Component;

@Component
public class CursoMapper {


    public CursoModel map(CursoDTO cursoDTO) {
        CursoModel cursoModel = new CursoModel();
        cursoModel.setId(cursoDTO.getId());
        cursoModel.setNome(cursoDTO.getNome());
        cursoModel.setCategoria(cursoDTO.getCategoria());
        cursoModel.setHabilidade(cursoDTO.getHabilidade());
        cursoModel.setHoras(cursoDTO.getHoras());
        cursoModel.setProfessor(cursoDTO.getProfessor());

        return cursoModel;
    }

    public CursoDTO map(CursoModel cursoModel) {

        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setId(cursoModel.getId());
        cursoDTO.setNome(cursoModel.getNome());
        cursoDTO.setCategoria(cursoModel.getCategoria());
        cursoDTO.setHabilidade(cursoModel.getHabilidade());
        cursoDTO.setHoras(cursoModel.getHoras());
        cursoDTO.setProfessor(cursoModel.getProfessor());
        return cursoDTO;

    }
}
