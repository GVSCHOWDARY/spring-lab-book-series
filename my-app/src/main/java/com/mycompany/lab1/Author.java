package com.mycompany.lab1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "authors")
@Entity
public class Author {
	 @GeneratedValue // generates id automically
	 @Id// primary key field
	Integer authorId;
	 @Column(name = "firstname", nullable = false)
	String firstName;
	 @Column(name = "middlename", nullable = false)
	String middleName;
	 @Column(name = "lastname", nullable = false)
	String lastName;
	Integer phoneNo;
	public Author() {
		//empty constructor
	}
	public Author(String firstName, String middleName, String lastName, Integer phoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		//parametric constructor
	}
	//getters and setters
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		} else if (!authorId.equals(other.authorId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		return result;
	}

}
