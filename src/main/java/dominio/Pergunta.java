package dominio;

import java.awt.Image;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe dominio Pergunta
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="pergunta")
public class Pergunta {
	
	/**
	 * Atributo itedenficador da classe Pergunta
	 */
	@Id
	@Column(name="id_pergunta", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o titulo da Pergunta
	 */
	@Column
	private String titulo;
	
	/**
	 * Atributo que guarda a descricao da Pergunta
	 */
	
	@Column
	private String descricao;
	
	/**
	 * Atributo que guarda o status da Pergunta
	 */
	@OneToOne(mappedBy="status_pergunta")
	private StatusPergunta statusPergunta;
	
	/**
	 * Atributo que guarda a lista de fotos da pergunta
	 */
	private List<Arquivo> foto;
	
	/**
	 * Atributo que guarda o Aluno que perguntou
	 */
	@ManyToOne
	@JoinColumn(name="id_aluno", referencedColumnName="id_aluno")
	private Aluno aluno;
	
	/**
	 * Atributo que guarda a Disciplina da Pergunta
	 */
	@ManyToOne
	@JoinColumn(name="id_disciplina", referencedColumnName="id_disciplina")
	private Disciplina disciplina;
	
	@OneToMany
	@JoinColumn(name="resposta_id")
	private List<Resposta> respostas;

	/**
	 * Construtor padrão da classe
	 */
	public Pergunta(){
		
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the statusPergunta
	 */
	public StatusPergunta getStatusPergunta() {
		return statusPergunta;
	}

	/**
	 * @param statusPergunta the statusPergunta to set
	 */
	public void setStatusPergunta(StatusPergunta statusPergunta) {
		this.statusPergunta = statusPergunta;
	}

	/**
	 * @return the foto
	 */
	public List<Arquivo> getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(List<Arquivo> foto) {
		this.foto = foto;
	}
	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}
	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	/**
	 * @return the disciplina
	 */
	public Disciplina getDisciplina() {
		return disciplina;
	}
	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
