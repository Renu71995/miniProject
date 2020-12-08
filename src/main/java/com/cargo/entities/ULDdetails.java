package com.cargo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class ULDdetails implements Serializable {
	
	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uldId;
	private Integer uldNumber;
	private Integer awbNumber;
	@OneToMany(mappedBy = "uldDetails")
	private List<BasicBookingDetails> basicBookingDetails;

}
