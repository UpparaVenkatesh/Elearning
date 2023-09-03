package com.product.crud.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
 
public class Course {
	@Id
	private int id;
	@Column(nullable=false)
	private String course_name;
	@Column(nullable=false)
	private String course_des;
	@Column(nullable=false)
	private int course_fees;
	//private byte[] image;
	@Column(nullable=false)
	private String image;
	@Column(nullable=false)
    private String cfile;
	
	

	public Course() {
		
	}
	
	
	
	
	
	
	public Course(int id, String course_name, String course_des, int course_fees,String image,String cfile) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.course_des = course_des;
		this.course_fees = course_fees;
		this.image=image;
		this.cfile=cfile;
		
	}







	public String getCfile() {
		return cfile;
	}






	public void setCfile(String cfile) {
		this.cfile = cfile;
	}






	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCourse_fees() {
		return course_fees;
	}

	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}

	


}
