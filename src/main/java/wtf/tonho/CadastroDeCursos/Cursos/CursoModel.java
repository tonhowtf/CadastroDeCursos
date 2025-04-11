package wtf.tonho.CadastroDeCursos.Cursos;

import jakarta.persistence.*;
import wtf.tonho.CadastroDeCursos.Professores.ProfessoresModel;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private String habilidade;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private ProfessoresModel professor;


    public CursoModel() {
    }

}
