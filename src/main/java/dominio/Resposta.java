package dominio;

import java.awt.Image;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Classe dominio Resposta
 * @author Fernanda Chacon
 *
 */
public class Resposta {
	
	/**
	 * Atributo identificador da classe Resposta 
	 */
	@Id
	@Column(name="id_resposta", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda a descri�ao da Resposta
	 */
	@Column
	private String descricao;
	
	/**
	 * Atributo que guarda o status da Resposta
	 */
	@OneToOne(mappedBy="status_resposta")
	private StatusResposta statusResposta;
	
	/**
	 * Lista que guarda as imagens da Resposta
	 */
	private List<Arquivo> fotos;
	
	/**
	 * Atributo que guarda o Aluno que respondeu
	 */
	@ManyToMany(mappedBy="respostas_aluno")
	private Aluno aluno;
	
	/**
	 * Atributo que guarda o Monitor que respondeu
	 */
	
	@ManyToMany(mappedBy="respostas_monitor")
	private Monitor monitor;
	
	/**
	 * Construtor padr�o da classe
	 */
	public Resposta(){
		
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
	 * @return the statusResposta
	 */
	public StatusResposta getStatusResposta() {
		return statusResposta;
	}

	/**
	 * @param statusResposta the statusResposta to set
	 */
	public void setStatusResposta(StatusResposta statusResposta) {
		this.statusResposta = statusResposta;
	}

	/**
	 * @return the fotos
	 */
	public List<Arquivo> getFotos() {
		return fotos;
	}

	/**
	 * @param fotos the fotos to set
	 */
	public void setFotos(List<Arquivo> fotos) {
		this.fotos = fotos;
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
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * @param monitor the monitor to set
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	

}
