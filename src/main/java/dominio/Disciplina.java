package dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe dominio Disciplina
 * 
 * @author Fernanda Chacon
 *
 */

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	/**
	 * Atributo identificador da classe Disciplina
	 */
	@Id
	@Column(name="id_disciplina", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o codigo da Disciplina
	 */
	@Column
	private String codigo;
	
	/**
	 * Atributo que guarda o nome da Disciplina
	 */
	@Column
	private String nome;
	
	/**
	 * Atributo que guarda o curso da Disciplina
	 */
	@Column
	private String curso;
	
	// ---------------duvidas aqui----------------
	/**
	 * Atributo que guarda a lista de alunos matriculados na
	 * Disciplina no semestre
	 */
	
	private List<Aluno> alunosMatriculados;
	
	/**
	 * Atributo que guarda a lista de monitores da Disciplina
	 * no semestre
	 */
	private List<Monitor> monitores;
	
	/**
	 * Atributo que guarda o professor da Disciplina
	 */
	private Professor professor;
	
	@OneToMany
	private List<Resposta> respostas;
	
	@OneToMany
	private List<Pergunta> perguntas;
	
	
	
	/**
	 * Construtor padrão da classe
	 */
	public Disciplina(){
		
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
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
	 * @return the alunosMatriculados
	 */
	public List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	/**
	 * @param alunosMatriculados the alunosMatriculados to set
	 */
	public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	/**
	 * @return the monitores
	 */
	public List<Monitor> getMonitores() {
		return monitores;
	}

	/**
	 * @param monitores the monitores to set
	 */
	public void setMonitores(List<Monitor> monitores) {
		this.monitores = monitores;
	}

	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
