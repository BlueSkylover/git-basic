package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result= new HashMap<String,Integer>();
        Set<String> uniquest = new HashSet(collection1);
        for(String temp:uniquest)
        {
            result.put(temp,Collections.frequency(collection1,temp));
        }

        return result;
    }
}
