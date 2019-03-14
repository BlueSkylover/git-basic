package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection3 = new HashMap<String, Integer>();
        Set<String> uniquest=new HashSet<>(collectionA);
        for(String key: uniquest)
        {
            if(key.length()>1)
            {
                String[] str1=key.split("-");
                collection3.put(str1[0],Integer.parseInt(str1[1]));
            }
            else
                collection3.put(key,Collections.frequency(collectionA,key));
        }
        List<String> str1=new ArrayList<>();
        for(String key: object.keySet())
        {
            str1=object.get(key);
            int flag=0;
            int count=0;
            for(int i=0;i<str1.size();i++)
            {
                String str2=str1.get(i);
                if(collection3.containsKey(str2))
                {
                    count++;
                    if(count>=3)
                        flag++;
                    collection3.put(str2,collection3.get(str2)-1-flag);
                }
            }
        }
        return collection3;
    }
}
