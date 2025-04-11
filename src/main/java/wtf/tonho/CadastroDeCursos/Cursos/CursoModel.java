package wtf.tonho.CadastroDeCursos.Cursos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wtf.tonho.CadastroDeCursos.Professores.ProfessoresModel;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
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


}
