/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. In a Runner class, make a Handy Blue Tumour. Use the methods below to make him eat, and print his name.
 * 2&3 see comments in code below
 * 4. Make a Papa Blue Tumour and print his name, hat colour and girl or boy.
 * 5. Make a Blue Tumour and print her name, hat colour and girl or boy. 
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
		System.out.println(name + " Blue Tumour is eating Smurfberries.");
	}

	/* Papa Blue Tumour wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		return "";
	}

	/* Blue Tumour is the only female Blue Tumour. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		return "";
	}

}



