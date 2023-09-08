package com.example.model;


//JPA- Java Persistence API
//JPA entity class
//@Entity- It identifies a class as an entity class
//@Table- It specifies the table in the database
//@Id- define the mapping to the primary key
//@GeneratedValue-used to automatically generate the primary key value


import javax.persistence.*;
import lombok.*;
@Entity  
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor 	  // default constructor
@AllArgsConstructor  //parameterized constructor
@Data
public class Student 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email")
  private String email;

public void setLastName(String string) {
	// TODO Auto-generated method stub
	
}

public void setFirstName(String string) {
	// TODO Auto-generated method stub
	
}

public void setEmail(String string) {
	// TODO Auto-generated method stub
	
}

public String getId() {
	// TODO Auto-generated method stub
	return null;
}

public String getFirstName() {
	// TODO Auto-generated method stub
	return null;
}
  
  
}