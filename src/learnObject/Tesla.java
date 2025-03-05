package learnObject;

public class Tesla extends ElectricCar {

	 double batteryLevel;
	
	//コンストラクタ
	public Tesla(String color, int price, int totalCapa) {
		super(color, price, totalCapa);
		this.batteryLevel = totalCapa;
		
	}

	
	@Override
	public void drive(double dis) {
	
		super.drive(dis);
		System.out.println("---------------------"); 
    	System.out.println(color + "色のテスラの総走行距離は" + dis + "kmです。\n車の値段は" + price + "万です。");
		
	}
	
	
	@Override
	void useElectric(double battery) {
		if (batteryLevel >= battery) {
			batteryLevel -= battery;
            System.out.println(battery + "％のバッテリーを消費しました。残りは" + batteryLevel + "％です。");
        } else {
            System.out.println(battery + "％のバッテリーを消費しました。もうバッテリーがありません。");
        }
		
	}
	
	
	

}
