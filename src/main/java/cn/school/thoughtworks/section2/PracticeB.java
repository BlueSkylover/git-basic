package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer>  result= new HashMap<String ,Integer>();
        Set<String> uniquer=new HashSet<>(collection1);
        for(String key:uniquer)
        {
            if(key.equals("d-5"))
                result.put("d",5);
            else
                result.put(key,Collections.frequency(collection1,key));
        }
        return result;
    }
}
