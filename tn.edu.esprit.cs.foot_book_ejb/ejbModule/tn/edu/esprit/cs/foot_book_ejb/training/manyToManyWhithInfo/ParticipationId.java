package tn.edu.esprit.cs.foot_book_ejb.training.manyToManyWhithInfo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ParticipationId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEmployee;
	private int idProject;

	public ParticipationId() {
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public ParticipationId(int idEmployee, int idProject) {
		super();
		this.idEmployee = idEmployee;
		this.idProject = idProject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmployee;
		result = prime * result + idProject;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipationId other = (ParticipationId) obj;
		if (idEmployee != other.idEmployee)
			return false;
		if (idProject != other.idProject)
			return false;
		return true;
	}

}
