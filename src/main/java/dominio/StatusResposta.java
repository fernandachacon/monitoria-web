package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe dominio StatusResposta
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="status_resposta")
public class StatusResposta {
	
	/**
	 * Atributo identificador da classe StatusResposta
	 */
	@Id
	@Column(name="id_status_resposta", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o nome do status da resposta
	 * 1. Resposta avaliada pelo monitor
	 * 2. Resposta não avaliada pelo monitor
	 */
	@Column
	private String nome;
	
	/**
	 * Construtor padrão da classe
	 */
	public StatusResposta(){
		
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
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
