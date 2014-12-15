package tn.edu.esprit.cs.foot_book_ejb.training.manyToManyWhithInfo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Participation
 * 
 */
@Entity
public class Participation implements Serializable {

	private ParticipationId participationId;
	private String mission;
	private Date dateOfMission;
	private static final long serialVersionUID = 1L;

	private Employee employee;
	private Project project;

	public Participation() {
		super();
	}

	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public Date getDateOfMission() {
		return this.dateOfMission;
	}

	public void setDateOfMission(Date dateOfMission) {
		this.dateOfMission = dateOfMission;
	}

	@EmbeddedId
	public ParticipationId getParticipationId() {
		return participationId;
	}

	public void setParticipationId(ParticipationId participationId) {
		this.participationId = participationId;
	}

	@ManyToOne
	@JoinColumn(name = "idEmployee", referencedColumnName = "id", insertable = false, updatable = false)
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne
	@JoinColumn(name = "idProject", referencedColumnName = "id", insertable = false, updatable = false)
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Participation(String mission, Date dateOfMission, Employee employee,
			Project project) {
		super();
		this.mission = mission;
		this.dateOfMission = dateOfMission;
		this.employee = employee;
		this.project = project;
		this.participationId = new ParticipationId(employee.getId(),
				project.getId());
	}

}
