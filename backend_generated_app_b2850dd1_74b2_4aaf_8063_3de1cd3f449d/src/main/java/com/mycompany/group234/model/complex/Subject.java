package com.mycompany.group234.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Subject {
  public Subject () {}
	
  @Column(name = "\"SubjectName\"", nullable = true)
  private String subjectName;
}
