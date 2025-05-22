package com.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity

@Table
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String youtube_channel;
	@Column
	private String hooby;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "instructorDetails")
	private Instructor instructor;
	
	public InstructorDetails(String youtube_channel, String hooby, Instructor instructor) {
		super();
		this.youtube_channel = youtube_channel;
		this.hooby = hooby;
		this.instructor = instructor;
	}
	
	public InstructorDetails(String youtube_channel, String hooby) {
		super();
		this.youtube_channel = youtube_channel;
		this.hooby = hooby;
	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", youtube_channel=" + youtube_channel + ", hooby=" + hooby
				+  "]";
	}
	
	
}
