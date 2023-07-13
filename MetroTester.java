class MetroTester{

public static void main(String metro[]){

Metro.addStationNames("Baiyappanahalli");
Metro.addStationNames("Attiguppe");
Metro.addStationNames("Banashankari");
Metro.addStationNames("Krishnarajapuram");
Metro.addStationNames("Indiranagar ");
Metro.addStationNames("Halasuru");
Metro.addStationNames("Mahatma Gandhi Road");
Metro.addStationNames("Mysuru Road");


Metro.getAllStationNames();

boolean isUpdated = Metro.updatedStationName("Baiyappanahalli","S V Road");
System.out.println("Is Metro Name updated"+ isUpdated);
Metro.getAllStationNames();
}

}