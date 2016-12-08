package sorting_by_Name_Age;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FinalShot_name_age {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		  
			  
			ArrayList al=new ArrayList();  
			al.add(new Student(101,"Vijay",23));  
			al.add(new Student(106,"Ajay",27));  
			al.add(new Student(105,"Jai",21));  
			  
			System.out.println("Sorting by Name...");  
			  
			Collections.sort(al,new Name());  
			
			Iterator itr=al.iterator();  
			while(itr.hasNext()){  
			Student st=(Student)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}  
			  
			System.out.println("sorting by age...");  
			  
			Collections.sort(al, new Age());  
			Iterator itr2=al.iterator();  
			while(itr2.hasNext()){  
			Student st=(Student)itr2.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}  
			
			System.out.println("sorting by rollno...");  
			  
			Collections.sort(al, new Rollno());  
			Iterator itr3=al.iterator();  
			while(itr3.hasNext()){  
			Student st =(Student)itr3.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			  

	 }

   }
}