package com.hib.entities;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "VEHICLE")
public class Vehicle implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String vin;
	private int modelYear;
	public Vehicle( int modelYear, String makeDes, String modelDes, String engineDes, String color,
			String licPlate, String licPlateState, String damageDes, int mileage, Claim claim) {
		super();
		this.modelYear = modelYear;
		this.makeDes = makeDes;
		this.modelDes = modelDes;
		this.engineDes = engineDes;
		this.color = color;
		this.licPlate = licPlate;
		this.licPlateState = licPlateState;
		this.damageDes = damageDes;
		this.mileage = mileage;
		this.claim = claim;
	}

	private String makeDes;
	private String modelDes;
	private String engineDes;
	private String color;
	private String licPlate;
	private String licPlateState;
	@Transient
	private Date licPlateExp;
	private String damageDes;
	private int mileage;
	private Claim claim;
	
	public Vehicle() {};
	
	@Id
    @Column(name = "ARTICLE_ID")
	public String getVin() {
		return vin;
	}
	
	public void setVin(String vin)
	{
		this.vin = vin;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	public String getMakeDes() {
		return makeDes;
	}
	public void setMakeDes(String makeDes) {
		this.makeDes = makeDes;
	}
	
	public String getModelDes() {
		return modelDes;
	}
	public void setModelDes(String modelDes) {
		this.modelDes = makeDes;
	}
	
	public String getEngineDes() {
		return engineDes;
	}
	
	public void setEngineDes(String engineDes) {
		this.engineDes = engineDes;
	}
		
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getLicPlate() {
		return licPlate;
	}
	
	public void setLicPlate(String licPlate) {
		this.licPlate = licPlate;
	}
	
	public String getLicPlateState() {
		return licPlateState;
	}
	
	public void setLicPlateState(String licPlateState) {
		this.licPlateState = licPlateState;
	}
	
	public Date getLicPlateExp() {
		return licPlateExp;
	}
	
	public void setLicPlateExp(Date licPlateExp) {
		this.licPlateExp = licPlateExp;
	}
	
	
	public String getDamageDes() {
		return damageDes;
	}
	
	public void setDamageDes(String damageDes) {
		this.damageDes = damageDes;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	public void setClaim(Claim c) {
		this.claim = c;
	}
	

	public Claim getClaim() {
		return claim;
	}
}

