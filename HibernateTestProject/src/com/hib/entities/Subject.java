package com.hib.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Subject {
@Id
	int SubjectID;
	
    

	String name;
	
	@ManyToOne
    @Column(name="Id")
	Student studentID;
	
	@Id
    @GeneratedValue
    @Column(name = "SubjectId")
	public int getSubjectID() {
		return SubjectID;
	}
	
	public void setSubjectID(int subjectID) {
		SubjectID = subjectID;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
    	
	
}
