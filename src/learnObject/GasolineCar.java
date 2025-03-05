package learnObject;

abstract public class GasolineCar extends Car {
	
	
	 // コンストラクタ
    public GasolineCar(String color, int price ,int totalCapa) {
        super(color, price, totalCapa);
       
    }
    
    @Override
    public void drive (double dis) {

    	super.drive(dis);
    }
    
 // 抽象メソッド
    abstract void useGasoline(double fuel);
     
}
