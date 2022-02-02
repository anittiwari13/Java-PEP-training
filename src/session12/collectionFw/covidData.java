package session12.collectionFw;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class covidData {
    public static void main(String[] args) {

        ArrayList<HashMap<String, Integer>> myList = new ArrayList<HashMap<String, Integer>>();


        HashMap<String, Integer> Punjab = new HashMap<String, Integer>();
        Punjab.put("Jalandhar",63245);
        Punjab.put("Amritsar",60456);
        Punjab.put("Ludhiana",45678);
        Punjab.put("Moga",50874);

        HashMap<String, Integer> UP = new HashMap<String, Integer>();
        UP.put("Kanpur Nagar",82933);
        UP.put("Lucknow",238839);
        UP.put("Unnao",15011);
        UP.put("Kanpur",82344);
        UP.put("Varanasi",85501);

        myList.add(Punjab);
        myList.add(UP);


        for (int a =0; a<myList.size();a++)
        {
            HashMap<String, Integer> tmpData = (HashMap<String, Integer>) myList.get(a);
            Set<String> key = tmpData.keySet();
            Iterator it = key.iterator();
            while (it.hasNext()) {
                String hmKey = (String)it.next();
                Integer hmData = (Integer) tmpData.get(hmKey);

                System.out.println("City: "+hmKey +"    Covid Cases: "+hmData);
                it.remove(); // avoids a ConcurrentModificationException
            }

        }

    }
}
