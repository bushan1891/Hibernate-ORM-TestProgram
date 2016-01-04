package com.hib.entities;  
  
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
    
@Entity  
@Table  
public class Student {  
      
    @Id  
    @GeneratedValue  
    private Integer id;  
    private String firstName;  
    private Integer age; 
    Set<Subject> SubjectSet;
      
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "CATEGORY_ARTICLE",
            joinColumns = @JoinColumn(name = "Id"),
            inverseJoinColumns = @JoinColumn(name = "SubjectId")
    )
    public Set<Subject> getSubjectSet() {
		return SubjectSet;
	}

	public void setSubjectSet(Set<Subject> subjectSet) {
		SubjectSet = subjectSet;
	}

	public Student() {};  
    
	@Id
    @GeneratedValue
    @Column(name = "Id")
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Student(Integer id, String firstName, Integer age) {  
        this.id = id;  
        this.firstName = firstName;  
        this.age = age;  
    }  
      
        //Here you need to generate getters and setters  
  
}  