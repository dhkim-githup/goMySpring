package preJava;

public class MainClass {
	

	public static void main(String[] args) {
	
	String   sName ="dhkim";
	String[] sCar = {"���׽ý�","�׷���","K7","�ҳ�Ÿ","���"} ; // Car Name
	int[] iPrice = {60000000, 40000000, 35000000, 30000000, 20000000}; // Car Price
	String[] sMaker = {"����","����","���","����","����"} ; // Car Maker
	String[] sHome = {"�ѱ�","�ѱ�","�ѱ�","�ѱ�","�ѱ�"} ; // Car Maker
	
		
		for(int i=0; i<sCar.length; i++) {
			System.out.print("Owner "+sName);
			
			System.out.print("Car Name "+sCar[i]);
			System.out.print("Car Price "+iPrice[i]);
			System.out.print("Car Maker "+sMaker[i]);
			System.out.println("Car Home "+sHome[i]);
			
			if(sCar[i].equals("���׽ý�")) {
				System.out.print(sCar[i]+" is 10 ");
				System.out.println("Size is Big ");
		    }else if(sCar[i].equals("�׷���")) {
		    	System.out.print(sCar[i]+" is  ");
		    	System.out.println("sound is Mid ");
		    }else if(sCar[i].equals("K7")) {
		    	System.out.print(sCar[i]+" is 8 ");		
		    	System.out.println("sound is Mid ");
		    }else if(sCar[i].equals("�ҳ�Ÿ")) {
		    	System.out.print(sCar[i]+" is 6 ");	
		    	System.out.println("sound is Compact ");
		    }else if(sCar[i].equals("���")) {
		    	System.out.print(sCar[i]+" is 4 ");
		    	System.out.println("sound is Small ");
		    }			
			
		}// end for
	
	
	}
	
	
	
	
	
}
