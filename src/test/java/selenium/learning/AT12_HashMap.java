package selenium.learning;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {
    @Test
    public void test12(){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Hasini",14);
        map.put("Chandhana",15);
        map.put("Hasya",11);
        map.put("Sahithi",13);
        System.out.println("The Length of HashMap: " +map.size());
        System.out.println("The Values in HashMap: " +map);


    }
}
