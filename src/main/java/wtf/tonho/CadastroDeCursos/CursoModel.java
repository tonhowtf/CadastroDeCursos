package wtf.tonho.CadastroDeCursos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private String nível;
    private String habilidades;

    public CursoModel(Long id, String nome, String categoria, String nível, String habilidades) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.nível = nível;
        this.habilidades = habilidades;
    }

    public CursoModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNível() {
        return nível;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
}
