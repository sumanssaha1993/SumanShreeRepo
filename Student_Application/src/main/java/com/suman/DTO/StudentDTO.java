package com.suman.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_hdr")
public class StudentDTO {
	private String std_name;
	@Id
	private String std_id;
	private String std_address;
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_id() {
		return std_id;
	}
	public void setStd_id(String std_id) {
		this.std_id = std_id;
	}
	public String getStd_address() {
		return std_address;
	}
	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}
	@Override
	public String toString() {
		return "StudentDTO [std_name=" + std_name + ", std_id=" + std_id + ", std_address=" + std_address + "]";
	}
	
	
}
