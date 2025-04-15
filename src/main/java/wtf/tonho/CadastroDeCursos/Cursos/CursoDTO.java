package wtf.tonho.CadastroDeCursos.Cursos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wtf.tonho.CadastroDeCursos.Professores.ProfessoresModel;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    private Long id;
    private String nome;
    private String categoria;
    private String habilidade;
    private ProfessoresModel professor;
    private int horas;
}
