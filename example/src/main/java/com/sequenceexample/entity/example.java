package com.sequenceexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EXAMPLE")
public class example {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="exa")
	@SequenceGenerator(name="exa",sequenceName = "example_sequence",initialValue = 5050,allocationSize = 1)
	private Long id;

}
