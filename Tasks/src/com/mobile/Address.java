package com.mobile;

public class Address {
	private String streetName;
    private String cityName;
    private long pinCode;
    
    public Address() {
                    super();
    }
    
    public Address(String streetName, String cityName, long pinCode) {
                    super();
                    this.streetName = streetName;
                    this.cityName = cityName;
                    this.pinCode = pinCode;
    }

    public String getStreetName() {
                    return streetName;
    }

    public void setStreetName(String streetName) {
                    this.streetName = streetName;
    }

    public String getCityName() {
                    return cityName;
    }

    public void setCityName(String cityName) {
                    this.cityName = cityName;
    }

    public long getPinCode() {
                    return pinCode;
    }

    public void setPinCode(long pinCode) {
                    this.pinCode = pinCode;
    }
public String toString() {
                    return "Street Name:= "+streetName+"\nCity Name:="+cityName+"\nPin Code:="+pinCode;

	}

}
