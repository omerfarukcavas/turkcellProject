package com.omerfarukcavas.pojo;

public class Member {
	private String marka;
	private String model;
	private String sinif;
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	
	public String toString() {
		return getMarka()+" "+getModel()+" "+getSinif();
	}
}
