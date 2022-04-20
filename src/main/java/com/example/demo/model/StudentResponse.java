package com.example.demo.model;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentResponse")
public class StudentResponse {
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zip")
	private String zip;
	
	@Id
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "liked")
	private String liked;
	
	@Column(name = "interests")
	private String interests;
	
	@Column(name = "likely")
	private String likely;
	
	@Column(name = "comment")
	private String comment;
	
	public StudentResponse() {}
	
	public StudentResponse(String firstName, String lastName, String street, String city, String state, String zip,
			String tel, String email, String date, String liked, String interests, String likely, String comment) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.tel = tel;
		this.email = email;
		this.date = date;
		this.liked = liked;
		this.interests = interests;
		this.likely = likely;
		this.comment = comment;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLiked() {
		return liked;
	}
	public void setLiked(String liked) {
		this.liked = liked;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getLikely() {
		return likely;
	}
	public void setLikely(String likely) {
		this.likely = likely;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "StudentResponse [firstName=" + firstName + ", lastName=" + lastName + ", street=" + street + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", tel=" + tel + ", email=" + email + ", date=" + date
				+ ", checked=" + (liked) + ", friends=" + interests + ", likely=" + likely
				+ ", comments=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hash(city, comment, date, email, firstName, interests, lastName, likely, state,
				street, tel, zip, liked);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentResponse other = (StudentResponse) obj;
		return Objects.equals(liked, other.liked) && Objects.equals(city, other.city)
				&& Objects.equals(comment, other.comment) && Objects.equals(date, other.date)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(interests, other.interests) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(likely, other.likely) && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street) && Objects.equals(tel, other.tel)
				&& Objects.equals(zip, other.zip);
	}
	
	
}
