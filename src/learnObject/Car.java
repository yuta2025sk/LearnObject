package learnObject;

abstract public class Car {
	
	//プロパティ
	 String name;
	 String color;
     double totalDistance = 0.0; //総走行距離
	 int totalCapa;
	 double nennpi;
	
	 
	 
	//コンストラクタ
	public Car(String name, String color, int totalCapa, double nennpi) {
		this.name = name;
		this.color = color;
		this.totalCapa = totalCapa;
		this.nennpi = nennpi;
	}
	
	
    //メソッド
	public void drive(double dis) {
		
		totalDistance += dis;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
