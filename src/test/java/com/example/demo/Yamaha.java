package com.example.demo;

public class Yamaha extends Moto{

	public Yamaha(String m) {
		modelo=m;
	}
	
	public Moto clone() throws CloneNotSupportedException{
		return (Yamaha)super.clone();
	}
}
