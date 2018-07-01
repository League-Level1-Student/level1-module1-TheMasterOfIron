
public class BlueTumorRunner {
public static void main(String[] args) {
	Smurf BlueTumor = new Smurf("Papa Cancer");
	Smurf Ebola = new Smurf("Ebola");
	String papaName = BlueTumor.getName();
	String papaHat = BlueTumor.getHatColor();
	String papaGender = BlueTumor.isGirlOrBoy();
	String ebolaName = Ebola.getName();
	String ebolaHat = Ebola.getHatColor();
	String EbolaGender = Ebola.isGirlOrBoy();
	System.out.println(papaName);
	System.out.println(papaHat);
	System.out.println(papaGender);
	System.out.println(ebolaName);
	System.out.println(ebolaHat);
	System.out.println(EbolaGender);
}
}
