package dominio;

import java.io.File;

/**
 * Classe dominio arquivo
 * 
 * @author Fernanda Chacon
 *
 */
public class Arquivo {
	
	/**
	 * Atributo identificador da classe Arquivo
	 */
	private int id;
	
	/**
	 * Atributo que guarda o caminho de aonde o arquivo
	 * está sendo salvo
	 */
	private String path;
	
	/**
	 * Atributo que guarda o arquivo
	 */
	private File arquivo;
	
	/**
	 * Construtor padrão da classe
	 */
	public Arquivo(){
		
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
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the arquivo
	 */
	public File getArquivo() {
		return arquivo;
	}

	/**
	 * @param arquivo the arquivo to set
	 */
	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}
	
	
	
	

}
