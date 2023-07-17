class RocketTester{
    public static void main(String roc[]){
	System.out.println("Creating 1st copy of the Rocket");
    Rocket rocket = new Rocket();
	rocket.name = "PSLV-C1";
	rocket.year = 1993;
    rocket.purpose = "India's first operational Polar Satellite Launch Vehicle (PSLV) mission, carrying the IRS-1E satellite";
	rocket.toDevelope();
	System.out.println(rocket.name +" "+ rocket.year + " " + rocket.purpose);
	
	System.out.println("Creating 2nd copy of the Rocket");
    Rocket rocket1 = new Rocket();
	rocket1.name = "PSLV-C11";
	rocket1.year = 2008;
    rocket1.purpose = "Launched Chandrayaan-1, India's first mission to the Moon";
	rocket1.toDevelope();
	System.out.println(rocket1.name +" "+ rocket1.year + " " + rocket1.purpose);
	
	System.out.println("Creating 3rd copy of the Rocket");
    Rocket rocket2 = new Rocket();
	rocket2.name = "GSLV-D3";
	rocket2.year = 2010;
    rocket2.purpose = "Carried GSAT-4 communication satellite, intended for augmenting the Indian National Satellite System";
	rocket2.toDevelope();
	System.out.println(rocket2.name +" "+ rocket2.year + " " + rocket2.purpose);
	
	System.out.println("Creating 4th copy of the Rocket");
    Rocket rocket3 = new Rocket();
	rocket3.name = "PSLV-C25";
	rocket3.year = 2013;
    rocket3.purpose = "Launched Mars Orbiter Mission (Mangalyaan), India's first interplanetary mission to Mars";
	rocket3.toDevelope();
	System.out.println(rocket3.name +" "+ rocket3.year + " " + rocket3.purpose);
	
	System.out.println("Creating 5th copy of the Rocket");
    Rocket rocket4 = new Rocket();
	rocket4.name = "GSLV Mk III-M1";
	rocket4.year = 2014;
    rocket4.purpose = "Launched Crew Module Atmospheric Reentry Experiment (CARE) to test crewed spaceflight technologies";
	rocket4.toDevelope();
	System.out.println(rocket4.name +" "+ rocket4.year + " " + rocket4.purpose);
	
	System.out.println("Creating 6th copy of the Rocket");
    Rocket rocket5 = new Rocket();
	rocket5.name = "PSLV-C37";
	rocket5.year = 2017;
    rocket5.purpose = "Successfully launched a record 104 satellites in a single mission, including Cartosat-2D";
	rocket5.toDevelope();
	System.out.println(rocket5.name +" "+ rocket5.year + " " + rocket5.purpose);
	
	System.out.println("Creating 7th copy of the Rocket");
    Rocket rocket6 = new Rocket();
	rocket6.name = "GSLV Mk II-F08";
	rocket6.year = 2018;
    rocket6.purpose = "Launched GSAT-6A, a communication satellite designed for mobile communication applications";
	rocket6.toDevelope();
	System.out.println(rocket6.name +" "+ rocket6.year + " " + rocket6.purpose);
	
	System.out.println("Creating 8th copy of the Rocket");
    Rocket rocket7 = new Rocket();
	rocket7.name = "PSLV-C43";
	rocket7.year = 2018;
    rocket7.purpose = "Launched HySIS, an earth observation satellite, along with 30 international co-passenger satellites";
	rocket7.toDevelope();
	System.out.println(rocket7.name +" "+ rocket7.year + " " + rocket7.purpose);
	
	System.out.println("Creating 9th copy of the Rocket");
    Rocket rocket8 = new Rocket();
	rocket8.name = "Chandrayaan-2";
	rocket8.year = 2019;
    rocket8.purpose = "Launched India's second mission to the Moon, Chandrayaan-2, with an orbiter, lander, and rover";
	rocket8.toDevelope();
	System.out.println(rocket8.name +" "+ rocket8.year + " " + rocket8.purpose);
	
	System.out.println("Creating 10th copy of the Rocket");
    Rocket rocket9 = new Rocket();
	rocket9.name = "PSLV-C49";
	rocket9.year = 2020;
    rocket9.purpose = "Successfully launched EOS-01 (RISAT-2BR2) and nine customer satellites";
	rocket9.toDevelope();
	System.out.println(rocket9.name +" "+ rocket9.year + " " + rocket9.purpose);
	}
}
	