package wtf.tonho.CadastroDeCursos.Professores;

import jakarta.persistence.*;
import wtf.tonho.CadastroDeCursos.Cursos.CursoModel;

import java.util.List;


@Entity
@Table (name = "tb_professores")
public class ProfessoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "professor")
    private List<CursoModel> cursos;

    public ProfessoresModel() {
    }

}
