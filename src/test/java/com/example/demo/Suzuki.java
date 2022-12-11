package com.example.demo;

public class Suzuki extends Moto{
	
	public Suzuki(String m) {
		modelo=m;
	}
	
	public Moto clone() throws CloneNotSupportedException{
		return (Suzuki)super.clone();
	}

}
