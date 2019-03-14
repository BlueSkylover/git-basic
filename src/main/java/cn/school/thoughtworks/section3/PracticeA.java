package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collectionB=new HashMap<String, Integer>();
        for(String key: object.keySet())
        {
            Set<String> uniquest=new HashSet<>(object.get(key));
            for (String key2:uniquest)
            {
                collectionB.put(key2,Collections.frequency(object.get(key),key2));
            }
        }
        for (String kk:collectionB.keySet())
        {
            if (collectionA.containsKey(kk))
                collectionA.put(kk,collectionA.get(kk)-collectionB.get(kk));
        }
        return collectionA;
    }
}
