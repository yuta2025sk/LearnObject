package learnObject;

public class Main {

	public static void main(String[] args) {
		
		Jimny jimny = new Jimny("ジムニー","黒",50,10);
		Tesla tesla = new Tesla("テスラ","白",100,8);
	
		
        jimny.drive(100);
        jimny.drive(200);
        
        tesla.drive(300);
        tesla.drive(200);
       
   
		
    }
}
