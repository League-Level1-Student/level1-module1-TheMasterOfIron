/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1&2 see comments in code below
 * 3. Make a Papa Blue Tumour and print his name, hat colour and girl or boy.
 * 4. Make a Blue Tumour and print her name, hat colour and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Blue Tumour.";
	}

	public void eat() {
		System.out.println(name + " Blue Tumour is eating Tumourberries.");
	}

	/* Papa Cancer wears a red hat, all the others are white. */
	public String getHatColor() {
		// 1. Fill in this method
		if(name .equals("Papa Cancer")) {
		return "Red";
	}
		else {
			return "White";
		}
	}

	/* Ebola is the only female Blue Tumour. */
	public String isGirlOrBoy() {
		if(name .equals("Ebola")) {
		return "Girl";
		}
		else {
		return "Boy";
	}
	}
	

}



