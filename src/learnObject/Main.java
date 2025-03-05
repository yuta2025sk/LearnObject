package learnObject;

public class Main {

	public static void main(String[] args) {
		
		Jimny jimny = new Jimny("black",300,50);
		Tesla tesla = new Tesla("white",800,100);
		
		 // 
        jimny.drive(20);
        jimny.useGasoline(5.5);
        
        
        
        tesla.drive(35);
        tesla.useElectric(21);
        
		
		
    }
}
