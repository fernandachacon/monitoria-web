package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe domínio Usuario
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="usuario")
public class Usuario {
	
	/**
	 * Atributo identificador da classe Usuario 
	 */
	@Id
	@Column(name="id_usuario", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda o login do Usuario
	 */
	@Column(unique=true)
	private String login;
	
	/**
	 * Atributo que guarda a senha do Usuario
	 */
	@Column
	private String senha;

	/**
	 * Construtor padrão da classe
	 */
	public Usuario(){
		
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
