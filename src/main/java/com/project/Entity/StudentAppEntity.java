package com.project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name ="StudentApp_Entity" )
@Entity

public class StudentAppEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long Id;
	@Column(name="Name")
	private String name;
	@Column(name="Section")
	private int section;
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the section
	 */
	public int getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(int section) {
		this.section = section;
	}
	

}
