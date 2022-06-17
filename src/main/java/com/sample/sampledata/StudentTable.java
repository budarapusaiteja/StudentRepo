package com.sample.sampledata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentTable {
	@Id
	private Integer id;
	public StudentTable() {
		
	}
	public StudentTable(Integer id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentTable [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	private String name;
	private double marks;
}
