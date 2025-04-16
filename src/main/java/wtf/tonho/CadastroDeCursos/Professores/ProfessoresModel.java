package wtf.tonho.CadastroDeCursos.Professores;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import wtf.tonho.CadastroDeCursos.Cursos.CursoModel;

import java.util.List;


@Entity
@Table (name = "tb_professores")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "cursos")
public class ProfessoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telefone;

    @OneToMany(mappedBy = "professor")
    @JsonIgnore
    private List<CursoModel> cursos;

}
