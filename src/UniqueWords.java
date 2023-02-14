// Hassan Mousa
// CUS1156_lab2
// 02/14/2023
// Software Design Methods
import java.util.ArrayList;
import java.util.HashSet;
public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	   

	   {
	   	  int count = 0;
	   	  HashSet uniqueList = new HashSet();
	   	  
	         for (int i = 0; i < list.size(); i++)
	         {		
	         System.out.println(list.get(i));
	       	  uniqueList.add(list.get(i));
	       	  count = uniqueList.size();
	         }
	   	  return count;
	      }
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
