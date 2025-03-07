package learnObject;

abstract public class ElectricCar extends Car {

	 double batteryLevel;
	
	 // コンストラクタ
	 public ElectricCar(String name, String color, int totalCapa, double nennpi) {
	        super(name,color, totalCapa,nennpi);
    	this.batteryLevel = totalCapa; //初期値としてバッテリーを満タン
    }
	
       
	 @Override
	  	public void drive(double dis) {
	  	
	  		super.drive(dis);
	  		useBattery(dis);

	  		System.out.println("新たに" + dis + "km走行しました。");
	      	System.out.println(color + "の" +  name  + "の総走行距離は" + totalDistance + "kmです。");
	      	
	      	// 残りのバッテリーから走行可能距離を計算
	          double nowDistance = batteryLevel * nennpi;
	          
	          if(nowDistance <= 0) {
	        	  System.out.println("もう走行できません。");
	          }else {
	        	  System.out.println("あと" + nowDistance + "km走行できます。");
	          }
	        
	          System.out.println("--------------------------------------------------------");
	  		
	  	}
	 
    // メソッド
    public void useBattery(double dis) {
    	
    	//使用したバッテリーを計算
    	double batteryUsed = dis / nennpi;
    	batteryLevel -= batteryUsed;
    	
    	if(batteryLevel < 0) {
    		System.out.println("消費したバッテリー：" + batteryUsed + "％");
    		System.out.println("バッテリーが無くなりました。");
    	}else {
    		System.out.println("消費したバッテリー：" + batteryUsed + "％");
    		System.out.println("残りのバッテリー：" +  batteryLevel + "％");
    		
    	}
    }
    
}
