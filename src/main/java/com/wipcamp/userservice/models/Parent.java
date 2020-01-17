package com.wipcamp.userservice.models;

import lombok.Data;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parents")
@Data
public class Parent {

	@Id
	@GeneratedValue
	private int id;

	@NonNull
	private String telNo;

	@NonNull
	private String relation;
}
