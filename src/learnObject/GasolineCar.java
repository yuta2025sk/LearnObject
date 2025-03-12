package learnObject;

abstract public class GasolineCar extends Car {
	
	  private double tankLevel;
	
	 // コンストラクタ
    public GasolineCar(String name, String color, int totalCapa, double nennpi) {
        super(name,color, totalCapa,nennpi);
        this.tankLevel = totalCapa;
       
    }
    
    @Override
    public void drive(double dis) {

    	double nowDistance = tankLevel * nennpi;// 残りのガソリン量から走行可能距離を計算

    	if (dis > nowDistance) {
    		System.out.println("指定した距離は残りのガソリンで走行できる距離を超えています。");
    		dis = nowDistance; // 走行距離を残りの走行可能な距離に制限
    	}

    	if (dis > 0) {
    		super.drive(dis);
    		useGasoline(dis);

    		System.out.println("新たに" + dis + "km走行しました。");
    		System.out.println(color + "の" + name + "の総走行距離は" + totalDistance + "kmです。");

    		nowDistance = tankLevel * nennpi; // 残りのガソリンで走行可能な距離を再計算

    		System.out.println("残り" + nowDistance + "km走行できます。");
    		System.out.println("--------------------------------------------------------");
    	} else {
    		System.out.println("これ以上は走行できません。");
    		System.out.println("--------------------------------------------------------");
    		   
    	}
    }

      
 // メソッド
    public void useGasoline(double dis) {
  
    	double gasoUsed = dis / nennpi;//使用したガソリン量を計算
    	tankLevel -= gasoUsed;
    	
    	if(tankLevel <= 0) {
       		System.out.println("消費したガソリン量：" + gasoUsed + "L");
    		System.out.println("ガソリンが無くなりました。");
    	}else {
    		System.out.println("消費したガソリン量：" + gasoUsed + "L");
    		System.out.println("残りのガソリン量：" + tankLevel + "L");
    		
    	}
    }
  
}
