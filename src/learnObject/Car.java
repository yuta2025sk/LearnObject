package learnObject;

abstract public class Car {
	
	//プロパティ
	 String color;
     double distance = 0.0; //総走行距離
	 int price;
	 int totalCapa;
	
	 
	 
	//コンストラクタ
	public Car(String color,  int price,  int totalCapa) {
		this.color = color;
		this.price = price;
		this.totalCapa = totalCapa;
	}
	
	
    //メソッド
	public void drive(double dis) {
		
		distance += dis;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
