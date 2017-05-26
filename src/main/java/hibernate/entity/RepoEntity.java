package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "REPO_TABLE",  uniqueConstraints = {
		@UniqueConstraint(columnNames = "REPO_NAME"),
		@UniqueConstraint(columnNames = "REPO_ID") })
public class RepoEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7675878643746113190L;
	private Integer id;
	private Integer repo_id;
	private String repo_name;
	private String  repo_number;
    private String  state;
    private String  title;
    private String  body;
    private String created_at;
    private String updated_at;
    private String closed_at;
    private String merged_at;
	public RepoEntity() {
	}

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
	  @SequenceGenerator(name = "auto_gen", sequenceName = "A")
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer stockId) {
		this.id = stockId;
	}

	@Column(name = "REPO_NAME", unique = true, nullable = false, length = 255)
	public String getRepo_name() {
		return this.repo_name;
	}

	public void setRepo_name(String Repo_name) {
		this.repo_name = Repo_name;
	}

	@Column(name = "REPO_NUMBER", unique = true, nullable = false, length = 255)
	public String getRepo_number() {
		return this.repo_number;
	}

	public void setRepo_number(String number) {
		this.repo_number = number;
	}



	@Column(name = "REPO_ID", unique = true, nullable = false,length = 20)
	public Integer getRepo_id() {
		return repo_id;
	}




	public void setRepo_id(Integer repo_id) {
		this.repo_id = repo_id;
	}



	@Column(name = "STATE", length = 255)
	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}



	@Column(name = "TITLE", length = 255)
	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}



	@Column(name = "BODY", length = 255)
	public String getBody() {
		return body;
	}




	public void setBody(String body) {
		this.body = body;
	}



	@Column(name = "CREATED_AT", length = 255)
	public String getCreated_at() {
		return created_at;
	}




	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}



	@Column(name = "UPDATED_AT", length = 255)
	public String getUpdated_at() {
		return updated_at;
	}




	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}



	@Column(name = "CLOSED_AT", length = 255)
	public String getClosed_at() {
		return closed_at;
	}




	public void setClosed_at(String closed_at) {
		this.closed_at = closed_at;
	}



	@Column(name = "MERGED_AT", length = 255)
	public String getMerged_at() {
		return merged_at;
	}




	public void setMerged_at(String merged_at) {
		this.merged_at = merged_at;
	}



}