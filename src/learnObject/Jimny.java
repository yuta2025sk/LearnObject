package learnObject;

public class Jimny extends GasolineCar {

    private double tankLevel;
	
    //コンストラクタ
	public Jimny(String color, int price, int totalCapa) {
		super(color, price, totalCapa);
        this.tankLevel = totalCapa;// 初期値としてタンクを満タン
	
	}

	@Override
	public void drive(double dis) {
	
		super.drive(dis);
		System.out.println("---------------------"); 
    	System.out.println(color + "色のジムニーの総走行距離は" + distance + "kmです。\n車の値段は" + price + "万です。");
		
		
	}
	
	@Override
	void useGasoline(double fuel) {
		if (tankLevel >= fuel) {
            tankLevel -= fuel;
            System.out.println(fuel + "リットルのガソリンを使用しました。残りの燃料は" + tankLevel + "リットルです。");
        } else {
            System.out.println(fuel + "リットルのガソリンを使用しました。燃料が足りません。");
        }
	}

	

	
	
}
