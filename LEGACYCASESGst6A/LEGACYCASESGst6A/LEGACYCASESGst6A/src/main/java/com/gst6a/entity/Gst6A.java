package com.gst6a.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table(name="mis_dgi_st_1a")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="firstProcedure",procedureName = "getGst6A",parameters = {@StoredProcedureParameter(mode=ParameterMode.IN,name="gcategory",type=Double.class)})})
public class Gst6A {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
      private String COMM_CODE;
	private Double COMM_DISPOSAL_NO;
	private Double JC_DISPOSAL_NO;
	private Double AC_DISPOSAL_NO;
	private Double SUP_DISPOSAL_NO;
	
	private Double 
/*	private Double comm_disposal_amt;
	private Double jc_disposal_amt;
	private Double ac_disposal_amt;
	private Double sup_disposal_amt;
	
	private Double comm_closing_amt;
	private Double jc_closing_amt;
	private Double ac_closing_amt;
	private  Double sup_closing_amt;
	
	private Double preve;
	private Double curr;*/
	public Gst6A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCOMM_CODE() {
		return COMM_CODE;
	}
	public void setCOMM_CODE(String cOMM_CODE) {
		COMM_CODE = cOMM_CODE;
	}
	public Double getPreve() {
		return preve;
	}
	public void setPreve(Double preve) {
		this.preve = preve;
	}
	public Double getCurr() {
		return curr;
	}
	public void setCurr(Double curr) {
		this.curr = curr;
	}
	
	
	
	

}
