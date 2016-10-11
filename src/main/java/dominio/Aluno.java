package dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe de dominio Aluno
 * 
 * @author Fernanda Chacon
 *
 */

@Entity
@Table(name="aluno")
public class Aluno {
	
	/**
	 * Atributo identificador da classe Aluno 
	 */
	@Id
	@Column(name="id_aluno", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda a matricula do Aluno
	 */
	
	@Column
	private String matricula;
	
	/**
	 * Atributo que guarda o curso do Aluno
	 */
	@Column
	private String curso;
	
	/**
	 * Lista das disciplinas que o Aluno está matriculado no semestre
	 */
	@ManyToMany
	@JoinTable(name="aluno_disciplina",
			joinColumns={@JoinColumn(name="id_aluno", referencedColumnName="id_aluno")},
			inverseJoinColumns={@JoinColumn(name="id_disciplina",
			referencedColumnName="id_disciplina")})
	private List<Disciplina> disciplinas;
	
	/**
	 * Atributo que guarda a Pessoa do Aluno
	 */
	@OneToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;

	/**
	 * Construtor padrão da classe
	 */
	public Aluno(){
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * @return the disciplinas
	 */
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/**
	 * @param disciplinas the disciplinas to set
	 */
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
