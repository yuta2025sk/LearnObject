package learnObject;

abstract public class ElectricCar extends Car {

	 private  double batteryLevel;
	
	 // コンストラクタ
	 public ElectricCar(String name, String color, int totalCapa, double nennpi) {
	        super(name,color, totalCapa,nennpi);
    	this.batteryLevel = totalCapa;
    }
	
       
	 @Override
	  	public void drive(double dis) {
	  	
		 double nowDistance = batteryLevel * nennpi;// 残りのバッテリー量から走行可能距離を計算
		 
		 if (dis > nowDistance) {
	    		System.out.println("指定した距離は残りのバッテリーで走行できる距離を超えています。");
	    		dis = nowDistance; // 走行距離を残りの走行可能な距離に制限
	    	}
		 
		 if (dis > 0) {
	    		super.drive(dis);
	    		useBattery(dis);

	    		System.out.println("新たに" + dis + "km走行しました。");
	    		System.out.println(color + "の" + name + "の総走行距離は" + totalDistance + "kmです。");

	    		nowDistance = batteryLevel * nennpi; // 残りのバッテリーで走行可能な距離を再計算
	    		

	    		System.out.println("残り" + nowDistance + "km走行できます。");
	    		System.out.println("--------------------------------------------------------");
	    	} else {
	    		System.out.println("これ以上は走行できません。");
	    		System.out.println("--------------------------------------------------------");
	    		   
	    	}
	  		
	  	}
	 
    // メソッド
    public void useBattery(double dis) {
    	
    	//使用したバッテリーを計算
    	double batteryUsed = dis / nennpi;
    	batteryLevel -= batteryUsed;
    	
    	if(batteryLevel <= 0) {
    		System.out.println("消費したバッテリー：" + batteryUsed + "％");
    		System.out.println("バッテリーが無くなりました。");
    	}else {
    		System.out.println("消費したバッテリー：" + batteryUsed + "％");
    		System.out.println("残りのバッテリー：" +  batteryLevel + "％");
    		
    	}
    }
    
}
