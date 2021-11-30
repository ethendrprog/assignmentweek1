package week1.day1;

public class Mobile {
	public void makecall() {
		System.out.println("make call");
		}
	
	public void sms() {
		System.out.println("sms sent");
	}
	String phonemodel = "redmi4";
	int mobilecost= 5000;
	boolean waterresistant =true;
	double price= 2436.42;

	    public static void main(String[] args) {
	    	Mobile mymobile = new Mobile();
	    	mymobile.makecall();
	    	mymobile.sms();
	    	System.out.println(mymobile.phonemodel);
	    	System.out.println(mymobile.mobilecost);
	   System.out.println(mymobile.waterresistant);
	   System.out.println(mymobile.price);
	    	
	    }
	

}
