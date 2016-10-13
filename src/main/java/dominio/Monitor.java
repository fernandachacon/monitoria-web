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
 * Classe dominio Monitor
 * 
 * @author Fernanda Chacon
 *
 */
@Entity
@Table(name="monitor")
public class Monitor {
	
	/**
	 * Atributo identificador da classe Monitor
	 */
	@Id
	@Column(name="id_monitor", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne
	@JoinColumn(name="pessoa_id")
	private Aluno aluno;

	/**
	 * Lista de disciplinas que a Pessoa é Monitor
	 */
	
	@ManyToMany
	@JoinTable(name="monitor_disciplina",
	joinColumns={@JoinColumn(name="monitor_id", referencedColumnName="monitor_id")},
	inverseJoinColumns={@JoinColumn(name="disciplina_id",
	referencedColumnName="disciplina_id")})
	private List<Disciplina> disciplinasMonitor;
	
	@ManyToMany
	@JoinTable(name="resposta_monitor",
	joinColumns={@JoinColumn(name="monitor_id", referencedColumnName="monitor_id")},
	inverseJoinColumns={@JoinColumn(name="resposta_id",
	referencedColumnName="resposta_id")})
	private List<Resposta> respostas;
	
	/**
	 * Construtor padrão da classe
	 */
	public Monitor(){
		
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
	 * @return the disciplinasMonitor
	 */
	public List<Disciplina> getDisciplinasMonitor() {
		return disciplinasMonitor;
	}

	/**
	 * @param disciplinasMonitor the disciplinasMonitor to set
	 */
	public void setDisciplinasMonitor(List<Disciplina> disciplinasMonitor) {
		this.disciplinasMonitor = disciplinasMonitor;
	}
	

}
