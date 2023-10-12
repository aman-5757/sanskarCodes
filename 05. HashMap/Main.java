import java.util.HashMap;

public class Main{

    public static void main(String [] args){
        HashMap<String, Integer> hm = new HashMap<>();
        //add
        hm.put("India", 420);
        hm.put("Pak", 380);
        hm.put("USA", 120);
        hm.put("Jap", 300);
        hm.put("India", 430);

        //get -> hm.get(key)
        System.out.println( hm.get("USA"));

        //remove -> hm.remove(key);
        System.out.println(hm);
        hm.remove("Jap");

        //size -> hm.size()
        System.out.println(hm.size());

        //keySet

        for(String key : hm.keySet()){
            System.out.println(key + "--" + hm.get(key));
        }

        //containsKey(key)
        System.out.println(hm.containsKey("USA"));


        System.out.println(hm);

    }
}