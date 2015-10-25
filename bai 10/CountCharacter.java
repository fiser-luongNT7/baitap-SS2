package baitapSS2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CountCharacter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 ArrayList<Character> Characterxs = new ArrayList<Character>();
		 ArrayList<Integer> Counts = new ArrayList<Integer>(); 

		 FileInputStream readFile = new FileInputStream("CountCharacter.txt");
		 Scanner scanner = new Scanner(readFile);
		 String temp = scanner.nextLine();
		 scanner.close();
		 for(int i = 0 ; i<temp.length();i++){
			 char check = temp.charAt(i);
			 if(Characterxs.contains(check)){
				 for(int j=0; j<Characterxs.size();j++){
					 if(Characterxs.get(j).equals(check)){
						 Counts.set(j, Counts.get(j)+1); 
					 }
				 }
			 }
		 	 else{
				 Characterxs.add(check);
				 Counts.add(1);
			 }
		 }  
		 for(int i = 0; i < Counts.size(); i++){
             for(int j = i + 1; j < Counts.size(); j++){
                 if(Counts.get(i) < Counts.get(j)){
                     Collections.swap(Counts, i, j);
                     Collections.swap(Characterxs, i, j);
                 }
                 else if(Counts.get(i).equals(Counts.get(j))){
                     if(Characterxs.get(i).compareTo(Characterxs.get(j)) > 0){
                         Collections.swap(Counts, i, j);
                         Collections.swap(Characterxs, i, j);
                     }
                 }
             }
         }
	     for(int i=0; i<Characterxs.size();i++){
	    	 System.out.println(Characterxs.get(i) +":\t" + Counts.get(i));
	     }
	}

}
