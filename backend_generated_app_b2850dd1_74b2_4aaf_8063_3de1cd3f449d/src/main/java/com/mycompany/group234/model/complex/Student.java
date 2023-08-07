package com.mycompany.group234.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Student {
  
	
  @Column(name = "\"Name\"", nullable = true)
  private String name;
	
  @Column(name = "\"Email\"", nullable = true)
  private String email;
	
  @Column(name = "\"StudentId\"", nullable = true)
  private Integer studentId;
}
