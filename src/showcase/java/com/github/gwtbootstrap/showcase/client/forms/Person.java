package com.github.gwtbootstrap.showcase.client.forms;

import java.util.Date;


public class Person {
	
	private Integer id;

	private Integer age;

	private String userName;
	
	private Date birthDay;
	
	private Favorite favorite = Favorite.NONE;
	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getAge() {
		return age;
	}

	
	public void setAge(Integer age) {
		this.age = age;
	}

	
	public String getUserName() {
		return userName;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public Favorite getFavorite() {
		return favorite;
	}

	
	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public Person() {
		
	}
	
	public Person(Integer id, String userName,Integer age, Favorite choice, Date birthDay) {
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.favorite = choice;
		this.birthDay = birthDay;
	}

	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public enum Favorite implements HasDisplayLabel {
		NONE("none"),
		JAVE("Java"),
		PYTHON("Python"),
		C("C"),
		CSHARTP("C#");

		private final String displayLabel;

		private Favorite(String displayLabel) {
			this.displayLabel = displayLabel;
		}
		
		@Override
		public String getDisplayLabel() {
			return displayLabel;
		}
	}


}