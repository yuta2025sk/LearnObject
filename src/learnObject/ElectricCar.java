package learnObject;

abstract public class ElectricCar extends Car {

	
	 // コンストラクタ
    public ElectricCar(String color, int price, int totalCapa) {
        super(color, price, totalCapa);
    }
	
    
    @Override
    public void drive (double dis) {

    	super.drive(dis);
  	
    }
    
    
    // 抽象メソッド
    abstract void useElectric(double battery);
    
}
