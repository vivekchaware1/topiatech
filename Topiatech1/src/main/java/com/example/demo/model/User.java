package com.example.demo.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String FullName;
	    private Date dateOfBirth;
	    private String username;
	    private String email;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFullName() {
			return FullName;
		}
		public void setFullName(String fullName) {
			FullName = fullName;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public User(Long id, String fullName, Date dateOfBirth, String username, String email) {
			super();
			this.id = id;
			FullName = fullName;
			this.dateOfBirth = dateOfBirth;
			this.username = username;
			this.email = email;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", FullName=" + FullName + ", dateOfBirth=" + dateOfBirth + ", username="
					+ username + ", email=" + email + "]";
		}
	    
	    
}
