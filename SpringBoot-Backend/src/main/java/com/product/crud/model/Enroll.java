package com.product.crud.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enroll {
	@Id
	private String id;
	private String course_name;
	private String course_des;
	private String course_fees;
	private String username;
	private String image;
	private String cfile;
	
	
public Enroll() {
		
	}
	
	public Enroll(String id, String course_name, String course_des, String course_fees, String username, String image, String cfile) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.course_des = course_des;
		this.course_fees = course_fees;
		this.username= username;
		this.image = image;
		this.cfile= cfile;
	}

	


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCfile() {
		return cfile;
	}

	public void setCfile(String cfile) {
		this.cfile = cfile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourse_fees() {
		return course_fees;
	}

	public void setCourse_fees(String course_fees) {
		this.course_fees = course_fees;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_des() {
		return course_des;
	}

	public void setCourse_des(String course_des) {
		this.course_des = course_des;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
