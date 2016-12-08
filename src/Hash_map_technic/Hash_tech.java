package Hash_map_technic;


import java.util.HashMap;
import java.util.Scanner;

public class Hash_tech {

	public static void main(String[] args) {
		boolean loopAgain = true;  
		Scanner in = new Scanner(System.in);
    
      
   HashMap<String,String> hmap = new HashMap<String,String>();
        
hmap.put("preetish", "8152888585");
hmap.put("pintu", "9431543369");
hmap.put("jaleshwar", "7079377847");


do {
	
	System.out.println("Enter name :-");
	String input = in.nextLine();
	
	if("preetish".equals(input)){
	System.out.println("Moblie no-"+hmap.get(input));
	
	}
	
	System.out.println("Enter name :-");
	String input2 = in.nextLine();
	
	if ("pintu".equals(input2));
System.out.println("Moblie no-"+hmap.get(input2));
	


System.out.println("Enter name :-");
String input1 = in.nextLine();

if ("pintu".equals(input1));
System.out.println("Moblie no-"+hmap.get(input1));

break;

} 


while (loopAgain);
in.close();
  }
}