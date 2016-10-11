package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe dominio StatusPergunta
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="status_pergunta")
public class StatusPergunta {
	
	/**
	 * Atributo identificador da classe StatusPergunta
	 */
	@Id
	@Column(name="id_status_pergunta", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o nome do status da pergunta
	 * 1. Pergunta esperando resposta
	 * 2. Pergunta respondida
	 */
	@Column
	private int nome;
	
	/**
	 * Construtor padrão da classe
	 */
	public StatusPergunta(){
		
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
	 * @return the nome
	 */
	public int getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(int nome) {
		this.nome = nome;
	}
	
	

}
