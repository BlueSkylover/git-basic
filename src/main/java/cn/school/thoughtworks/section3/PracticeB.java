package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collectionB = new HashMap<String, Integer>();
        List<String> str1=new ArrayList<>();
        for(String key: object.keySet())
        {
            str1=object.get(key);
            int flag=0;
            int count=0;
            for(int i=0;i<str1.size();i++)
            {
                String str2=str1.get(i);
                if(collectionA.containsKey(str2))
                {
                    count++;
                    if(count>=3)
                        flag++;
                    collectionA.put(str1.get(i),collectionA.get(str2)-1-flag);
                }
            }
        }
        return collectionA;
    }
}
