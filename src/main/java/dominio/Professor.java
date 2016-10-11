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
 * Classe dominio Professor
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="professor")
public class Professor {
	
	/**
	 * Atributo identificador da classe Professor
	 */
	
	@Id
	@Column(name="id_professor", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/**
	 * Atributo que guarda a pessoa do Professor
	 */
	@OneToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	/**
	 * Lista de disciplina que o professor leciona no semestre
	 */
	@ManyToMany
	@JoinTable(name="professor_disciplina",
			joinColumns={@JoinColumn(name="id_professor", referencedColumnName="id_professor")},
			inverseJoinColumns={@JoinColumn(name="id_disciplina",
			referencedColumnName="id_disciplina")})
	private List<Disciplina> disciplinas;

	/**
	 * Construtor padrão da classe
	 */
	public Professor(){
		
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
