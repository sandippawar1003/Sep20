package Logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Array_Find_Occurance_Of_Duplicate_Elements_InArray {

	public static void main(String[] args) {
		String[] arr= {"Java","JSP","Servelet","Java","Struts","JSP","JDBC","Java","Java","JDBC"};
		
		HashMap<String, Integer>map= new HashMap<String,Integer>();
		
		for(String str:arr) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else
			{
				map.put(str,1);
			}
		}
		
		Set<String> setValue=map.keySet();
		for (String str:setValue) {
			//if(map.get(str)>1){
		//System.out.println(str+":"+map.get(str));	
		//}
		}
		
	}
	
}
