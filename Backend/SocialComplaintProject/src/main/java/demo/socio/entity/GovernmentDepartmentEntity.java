package demo.socio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Table(name = "government_department_information_tbl")
public class GovernmentDepartmentEntity {

	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY ,generator = "governmment_department_id")
	private int governmment_department_id;

	@Column
	private String governmment_department_name;


	@OneToMany(mappedBy = "governmment_department_id",cascade =CascadeType.ALL )
	private List<ComplaintCategoryEntity>department_id=new ArrayList<>();

	public GovernmentDepartmentEntity() {
		super();
	}

	public List<ComplaintCategoryEntity> getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(List<ComplaintCategoryEntity> department_id) {
		this.department_id = department_id;
	}

	public GovernmentDepartmentEntity(
			int governmment_department_id,
			String governmment_department_name) {
		super();
		this.governmment_department_id = governmment_department_id;
		this.governmment_department_name = governmment_department_name;
	}

	public int getGovernmment_department_id() {
		return governmment_department_id;
	}

	public void setGovernmment_department_id(int governmment_department_id) {
		this.governmment_department_id = governmment_department_id;
	}

	public String getGovernmment_department_name() {
		return governmment_department_name;
	}

	public void setGovernmment_department_name(String governmment_department_name) {
		this.governmment_department_name = governmment_department_name;
	}




}