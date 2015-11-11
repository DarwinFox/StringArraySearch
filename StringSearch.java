import java.util.ArrayList;

/**
 * Created by Harrison Fox on 10/18/15.
 */
public class StringSearch {

    private boolean found = false;
    private int stringCount;
    private int items;
    private String toFind;
    private String a;
    private CharSequence s;
    private ArrayList<String> e;

    public StringSearch(ArrayList<String> f, String b){
        e = f;
        e = (ArrayList<String>)e.clone();
        a = b;
        s = a;
        items = e.size();
        toFind = a;
        String prefix = "\"";
        String suffix = "\"";

        if (b.startsWith(prefix) && b.endsWith(suffix) ) {
            a = a.substring(1, a.length()-1);
            s = a;
        }
        else{
             a = a.toLowerCase();
             for (int x = 0; x < e.size(); x++) {
                 String y = e.get(x);
                 y = y.toLowerCase();
                 e.set(x, y);
             }
        }
    }

    public boolean Search() {
        int y = e.size();

        if (y == 1)
        {
            String c = e.get(e.size()-1);
            if (c.contains(s)) {
                stringCount++;
                found = true;
            }

//            if (e.contains(a)){
//                stringCount++;
//                found = true;
//            }
        }

        else {
            String c = e.get(e.size()-1);
            if (c.contains(s)) {
                stringCount++;
                found = true;
            }
                e.remove(e.size()-1);
                Search();

//            if (e.contains(a)) {
//                stringCount++;
//                found = true;
//                int i = e.lastIndexOf(a);
//                e.remove(i);
//                Search();
//            }
        }

        return found;
    }

    public int listLength(){
        return items;
    }

    public int numberFound(){
        return stringCount;
    }

    public String toString() {
        if (found) {
            return "We found " + toFind + " in your list of " + this.listLength() +
                    " Strings, and the number of times it was found is: " + this.numberFound();
        } else
            return "It looks like " + toFind + " is not in your list of " + this.listLength() + " Strings.";
    }
}
