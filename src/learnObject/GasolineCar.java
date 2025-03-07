package learnObject;

abstract public class GasolineCar extends Car {
	
	 double tankLevel;
	
	 // コンストラクタ
    public GasolineCar(String name, String color, int totalCapa, double nennpi) {
        super(name,color, totalCapa,nennpi);
        this.tankLevel = totalCapa;// 初期値としてタンクを満タン
       
    }
    
    @Override
  	public void drive(double dis) {
  	
  		super.drive(dis);
  		useGasoline(dis);

  		System.out.println("新たに" + dis + "km走行しました。");
      	System.out.println(color + "の" +  name  + "の総走行距離は" + totalDistance + "kmです。");
      	
      	// 残りのガソリン量から走行可能距離を計算
          double nowDistance = tankLevel * nennpi;
          
          if(nowDistance <= 0) {
        	  System.out.println("もう走行できません。");
          }else {
        	  System.out.println("あと" + nowDistance + "km走行できます。");
          }
        
          System.out.println("--------------------------------------------------------");
  		
  	}
      
 // メソッド
    public void useGasoline(double dis) {
  
    	//使用したガソリン量を計算
    	double gasoUsed = dis / nennpi;
    	tankLevel -= gasoUsed;
    	
    	if(tankLevel < 0) {
    		System.out.println("消費したガソリン量：" + gasoUsed + "L");
    		System.out.println("ガソリンが無くなりました。");
    	}else {
    		System.out.println("消費したガソリン量：" + gasoUsed + "L");
    		System.out.println("残りのガソリン量：" + tankLevel + "L");
    		
    	}
    	
    }
  
 
     
}
