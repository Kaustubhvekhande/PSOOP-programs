

class Time{
	int hours,minutes,seconds;
	Time(){
		hours=0;
		minutes=0;
		seconds=0;
	}
	
	void conversion1(int sec){
		hours = sec /3600;
		sec = sec%3600;
		minutes= sec/60;
		seconds= sec%60;
		System.out.println("Hours="+hours);
		System.out.println("Minutes=" + minutes);
		System.out.println("Seconds=" +seconds);
	}
	
	void conversion2(int hour, int min , int sec){
		hours =hour;
		minutes= min;
		seconds = sec;
		int totSec= hour*3600 +min*60+ sec;
		System.out.println("Total time in seconds =" +totSec);
		
	}
}







