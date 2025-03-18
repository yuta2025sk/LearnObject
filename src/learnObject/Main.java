package learnObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		     
        TalkingJimny tJimny = new TalkingJimny("トーキングジムニー","青",50,10);
        TalkingTesla tTesla = new TalkingTesla("トーキングテスラ","白",100,15);
        TalkingCasio tcasio = new TalkingCasio("トーキングカシオ","シルバー");
        TalkingAppleWatch tappleWatch = new TalkingAppleWatch("トーキングアップルウォッチSE","黒");
        
     // Talkable型のArrayListに追加
        ArrayList<Talkable> list = new ArrayList<>();
        list.add(tJimny);
        list.add(tTesla);
        list.add(tcasio);
        list.add(tappleWatch);
        
        
        for(int i= 0; i<list.size(); i++){    //for(Talkable talktable : list)  
        	Talkable talkable = list.get(i);
        	talkable.speak();
        	
        	if (talkable instanceof TalkingJimny) {
                tJimny = (TalkingJimny) talkable;  //キャストを使用してTalkingJimny型として扱えるようにしている
                tJimny.drive(100); 
            } else if(talkable instanceof TalkingTesla) {
                tTesla = (TalkingTesla) talkable;
            	tTesla.drive(300);
            } else if (talkable instanceof TalkingCasio) {
                tcasio = (TalkingCasio) talkable;
                tcasio.displayTime(12, 45);
                tcasio.ringAlarm(); 
            } else if (talkable instanceof TalkingAppleWatch) {
                tappleWatch = (TalkingAppleWatch) talkable;
                tappleWatch.displayTime(14, 30); 
                tappleWatch.countHeartRate(); 
            }
        	
        }   
        
        
       HashMap<String,String> map = new  HashMap<String,String>();
       
       map.put("トーキングジムニー","青");
       map.put("トーキングテスラ","白");
       map.put("トーキングカシオ","シルバー");
       map.put("トーキングアップルウォッチSE","黒");
       
       System.out.println("---------------------------------------------------------"); 
       
       for(String key : map.keySet()){
    	   String value = map.get(key);// キーに基づいて値を取
    	   System.out.println("キー：" + key + "   値：" + value);
       }
        
        
    }
	
}
