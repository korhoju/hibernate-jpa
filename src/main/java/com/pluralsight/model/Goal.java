package com.pluralsight.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="goals")
@Data
public class Goal {

	@Id
	@GeneratedValue(strategy=SEQUENCE, generator="hibernate_sequence")
	@SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence")
	@Column(name="GOAL_ID")
	private long id;

	@Range(min = 1, max = 120)
	@Column(name="MINUTES")
	private int minutes;
	
}
