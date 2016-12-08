package Hash_map_technic;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {

	
		public static void main(String[] args) throws InterruptedException {

			// declare the hashmap
			HashMap<String,Integer> mapStudent = new HashMap<String,Integer>();
			boolean loopAgain = true;
			Scanner scan = new Scanner(System.in);

			// loop while user not entering no
			do {
				// ask for user input for id number
				System.out.print("Enter name:");
				String name =(scan.nextLine());

				// ask for user input which corresponds to student name
				System.out.print("Enter mobile-no:");
				Integer nbr = Integer.parseInt(scan.nextLine()); 

				// add the key value pair from user input to the hashmap

				Object oldVal = mapStudent.put(name, nbr);
                 if (oldVal!=null) {
					System.out.println("contact person:" + name + " is "
							+ oldVal + " and has been overwritten by " + nbr);
				}

				// ask user to check if another entry is required
				System.out.print("Enter another Contact (y/n)?");
				String answer = scan.nextLine();

				// condition to satisfy in order to loop again
				if (answer.equals("y") || answer.equals("Y")) {
					continue;
				} else {
					break;
				}

			} while (loopAgain);
			scan.close();

			System.out.println("\n**********************************");
			System.out.println("The following Contact nbr are in database");
			System.out.println("   Name  "+ "      nbr");		
			for(String id:mapStudent.keySet()){
				System.out.println("   "+id+"     "+mapStudent.get(id));
			}
			System.out.println("\n**********************************");
		}

}

