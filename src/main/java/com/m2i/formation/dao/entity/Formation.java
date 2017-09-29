package com.m2i.formation.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FORMATION")
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FORMATION_ID")
	private int id;
	@Column(name = "FORMATION_THEME")
	private String theme;

	// Constructeurs
	public Formation() {

	}

	public Formation(String theme) {

		this.theme = theme;
	}

	public Formation(int id) {

		this.id = id;
	}

	public Formation(int id, String theme) {

		this.id = id;
		this.theme = theme;
	}

	/*
	 * Getters
	 */
	public int getId() {
		return id;
	}

	public String getTheme() {
		return theme;
	}

	/*
	 * Setters
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
