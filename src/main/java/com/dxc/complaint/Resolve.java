package com.dxc.complaint;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Resolve")
public class Resolve {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rId")
	@PrimaryKeyJoinColumn
	private int rId;
	
	@Column(name="complaintId")
	private int complaintId;
	
	@Column(name="resolvedBy")
	private String resolvedBy;
	
	@Column(name="rComments")
	private String rComments;
	
	

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	
	public String getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public String getrComments() {
		return rComments;
	}

	public void setrComments(String rComments) {
		this.rComments = rComments;
	}
	
	

}
