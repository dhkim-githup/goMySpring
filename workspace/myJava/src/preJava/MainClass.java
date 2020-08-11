package preJava;

public class MainClass {
	

	public static void main(String[] args) {
	
	String   sName ="dhkim";
	String[] sCar = {"제네시스","그랜저","K7","소나타","모닝"} ; // Car Name
	int[] iPrice = {60000000, 40000000, 35000000, 30000000, 20000000}; // Car Price
	String[] sMaker = {"현대","현대","기아","현대","현대"} ; // Car Maker
	String[] sHome = {"한국","한국","한국","한국","한국"} ; // Car Maker
	
		
		for(int i=0; i<sCar.length; i++) {
			System.out.print("Owner "+sName);
			
			System.out.print("Car Name "+sCar[i]);
			System.out.print("Car Price "+iPrice[i]);
			System.out.print("Car Maker "+sMaker[i]);
			System.out.println("Car Home "+sHome[i]);
			
			if(sCar[i].equals("제네시스")) {
				System.out.print(sCar[i]+" is 10 ");
				System.out.println("Size is Big ");
		    }else if(sCar[i].equals("그랜저")) {
		    	System.out.print(sCar[i]+" is  ");
		    	System.out.println("sound is Mid ");
		    }else if(sCar[i].equals("K7")) {
		    	System.out.print(sCar[i]+" is 8 ");		
		    	System.out.println("sound is Mid ");
		    }else if(sCar[i].equals("소나타")) {
		    	System.out.print(sCar[i]+" is 6 ");	
		    	System.out.println("sound is Compact ");
		    }else if(sCar[i].equals("모닝")) {
		    	System.out.print(sCar[i]+" is 4 ");
		    	System.out.println("sound is Small ");
		    }			
			
		}// end for
	
	
	}
	
	
	
	
	
}
