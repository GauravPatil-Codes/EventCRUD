package com.dte.vivek.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import java.util.*;

@Entity
public class Event {

	@Id
	private int uid;
	
	private String name;
	
	private String tagline;
	
	private Date schedule;
	
	private String description;
	
	@Lob
	private byte[] files;
	
	
	private String host;
	
	private String category;
	
	private String sub_category;
	
	private int rigor_bank;
	
	@Column(name = "attendees")
	@ElementCollection(targetClass = Long.class)
	private List<Long> attendees = new ArrayList<>();

	public Event(int uid, String name, String tagline, Date schedule, String description, byte[] files, String host,
			String category, String sub_category, int rigor_bank, List<Long> attendees) {
		super();
		this.uid = uid;
		this.name = name;
		this.tagline = tagline;
		this.schedule = schedule;
		this.description = description;
		this.files = files;
		this.host = host;
		this.category = category;
		this.sub_category = sub_category;
		this.rigor_bank = rigor_bank;
		this.attendees = attendees;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(String name2, String tagline2, Date schedule2, String description2, byte[] files2, String host2,
			String category2, String sub_category2, int rigor_rank) {
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public Date getSchedule() {
		return schedule;
	}

	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getFiles() {
		return files;
	}

	public void setFiles(byte[] files) {
		this.files = files;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSub_category() {
		return sub_category;
	}

	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}

	public int getRigor_bank() {
		return rigor_bank;
	}

	public void setRigor_bank(int rigor_bank) {
		this.rigor_bank = rigor_bank;
	}

	public List<Long> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Long> attendees) {
		this.attendees = attendees;
	}

	@Override
	public String toString() {
		return "Event [uid=" + uid + ", name=" + name + ", tagline=" + tagline + ", schedule=" + schedule
				+ ", description=" + description + ", files=" + Arrays.toString(files) + ", host=" + host
				+ ", category=" + category + ", sub_category=" + sub_category + ", rigor_bank=" + rigor_bank
				+ ", attendees=" + attendees + "]";
	}

	public void setImage(byte[] imageData) {
		// TODO Auto-generated method stub
		
	}
	
	

}
