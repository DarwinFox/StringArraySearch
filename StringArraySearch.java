import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Harrison Fox on 10/18/15.
 */
public class StringArraySearch {

    public static void main (String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String userInput;
        String toSearch;
        boolean done = false;

        System.out.println("Enter your Strings to search, return after each string and letter d when done.");
        while (!done)
        {
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("d")){
                done = true;
            }
            else{
                int x= 0;
                stringArrayList.add(x, userInput);
            }
        }
//        System.out.println(stringArrayList);
        System.out.println("Please enter the String you would like to search for in your list of Strings.");
        toSearch = scan.nextLine();
        StringSearch Searcher = new StringSearch(stringArrayList, toSearch);
        Searcher.Search();
        System.out.println(Searcher);
        System.out.println(stringArrayList);
    }
}
