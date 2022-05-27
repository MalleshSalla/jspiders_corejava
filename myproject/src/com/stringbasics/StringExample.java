package com.stringbasics;


public class StringExample {

	public static void main(String[] args) {
		
	
		/*
		 * String r =new String("durga");
		 *  r.concat("software"); 
		 *  System.out.println(r);
		 * StringBuffer sb = new StringBuffer("Durga"); 
		 * sb.append(" Software");
		 * System.out.println(sb);
		 * 
		 * // use the escape character String example = "This is the \"String\" class.";
		 * System.out.println(example);
		 */
		
		
		//   String --> String is predefine class which present in java.lang package
		//          --> in java string is an
		//               1. object
		//               2. datatype
		//               3. class
		//               4. group of charecters
		
		
		/*
		 * String Object :
		 * 
		 * String objects can be created in two ways
		 *          1. Using " new " keyword. 
		 *          2. Using String literals .
		 * 
		 *       1. Using new keyword : when we use new keyword  two objects will be created 
		 *			   
		 *               1) one is under heap area - reference variable assigned to it.
		 *			 	 2)	another is under string constant pool(SCP) - it is small
		 *					part of heap area no reference assigned to it, it is only 
		 *					for backup.      
		 *					
	     *			ex: String str = new String("Java");
			
					
		 *		2.  Using literal:  
					
		 *    		first JVM will go to SCP and check if there is any object present 
		 *			with string data, if it is there it will assign reference to it, 
		 *			if it is not there it creates new object and assign reference.
		 *			
		 *			String  str = "java developer";
		 *
					
					IMMUTABILITY 
					------------- 
					 	-->	we understand that for one string object there can 
							be multiple references assigned to it, if we change data of one string object 
							it will effect to multiple references thats why java says that string 
							objects are immutable i.e once we created we cannot modify it.
		 */
			
			String str = "java";
			
			String str1 = new String("java");
			
			String str2 = new String("java developer");
			
			System.out.println(str1.equals(str));// (true)  in String equals method check the content only.
			System.out.println(str1.equals(str2));// (false)
			
			
			String s = "core java ";
			s=s.concat("developer");
			
			System.out.println(s);
			
	}
}
