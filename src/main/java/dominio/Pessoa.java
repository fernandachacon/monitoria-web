package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe de domínio Pessoa
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="pessoa")
public class Pessoa {
	
	/**
	 * Atributo identificador da classe Pessoa
	 */
	@Id
	@Column(name="id_pessoa", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo pra guardar o nome da Pessoa
	 */
	@Column
	private String nome;
	
	/**
	 * Atributo para guardar o cpf da Pessoa
	 */
	@Column
	private String cpf;
	
	/**
	 * Atributo para guardar o sexo da Pessoa
	 */
	
	@Column
	private String sexo;
	
	/**
	 * Atributo para guardar o email da Pessoa
	 */
	
	@Column
	private String email;
	
	/**
	 * Atributo que guarda o Usuario da Pessoa
	 */
	
	@OneToOne(mappedBy="usuario")
	private Usuario usuario;
	
	/**
	 * Construtor padrão da classe
	 */
	public Pessoa(){
		
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

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
