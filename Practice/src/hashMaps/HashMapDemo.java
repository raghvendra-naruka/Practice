package hashMaps;

import java.util.*;

class HashMapDemo{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Rag");
        map.put(2, "Ragh");
        map.put(3, "Raghz");
        map.put(4, "Ragz");
        map.put(5, "Rags");
        map.put(6, "Raghav");
    
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
        Map.Entry me = (Map.Entry)i.next();
        System.out.println(me.getKey()+" : "+ me.getValue());
        }
        System.out.println("The size of HashMap: " + map.size());
        //remove
        map.remove(5);
        map.remove(3);
        System.out.println("after removal");
       // map.put(2, "ragg");//overwrites 
        /*Set set1 = map.entrySet();
        Iterator it = set1.iterator();
        while(it.hasNext()){
        Map.Entry me = (Map.Entry)it.next();
        System.out.println(me.getKey()+" : "+ me.getValue());
        }*/
        System.out.println(map);
        //add a new entry
        
        String var = map.get(1);
        System.out.println(var);
        map.put(1, var + " Naruka");
        System.out.println(map.get(1));
        
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Raghav"));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("Raag"));
        System.out.println(map);
         
        HashMap hm = new HashMap();
        hm = (HashMap) map.clone();
        System.out.println("The new hashmap is: \n" + hm);
        hm.clear();
        System.out.println("Now hm:" + hm);
        System.out.println(hm.isEmpty());
        HashMap mp = new HashMap();
        mp.putAll(map);
        System.out.println(mp);
        
    }  
}
