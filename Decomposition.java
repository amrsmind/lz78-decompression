package lz78pro;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.util.Pair; 

public class Decomposition {

	public static void main(String[] args) {
      ArrayList<Pair<Integer,Character>> tags = new ArrayList<Pair<Integer,Character>>(1);
	  ArrayList<String> tbl = new ArrayList<String>(1);
	  String str = "";
	  tbl.add("");
	  
	  
	  ////////get input 
     /* tags.add(new Pair<Integer,Character>(0,'A'));
      tags.add(new Pair<Integer,Character>(0,'B'));
      tags.add(new Pair<Integer,Character>(1,'A'));
      tags.add(new Pair<Integer,Character>(2,'A'));
      tags.add(new Pair<Integer,Character>(4,'A'));
      tags.add(new Pair<Integer,Character>(4,'B'));
      tags.add(new Pair<Integer,Character>(2,'B'));
      tags.add(new Pair<Integer,Character>(7,'B'));
      tags.add(new Pair<Integer,Character>(8,'B'));
      tags.add(new Pair<Integer,Character>(1,null));*/
	  
      System.out.println("Enter the number of tags");
      Scanner tagnum = new Scanner(System.in);
      int counter = tagnum.nextInt();
       for(int i=0;i<counter;i++){   
    	Scanner In = new Scanner(System.in);
    	int a = In.nextInt();
  		String s = In.next();
        //System.out.println("s : " + s);

  		if(s.contains("null")){
  	        tags.add(new Pair<Integer,Character>(a,null));
  	        break;
  		}
  		char c = s.charAt(0);
        tags.add(new Pair<Integer,Character>(a,c));
       }
  	
      for (Pair<Integer,Character> p: tags){ 
    	  tbl.add(tbl.get(p.getKey()) + p.getValue());
          if(p.getValue() == null){
        	  str = str + tbl.get(p.getKey());
        	  continue;
          }
    	  str = str + tbl.get(p.getKey()) + p.getValue();
      }
      
      System.out.println(str);

	}

}
