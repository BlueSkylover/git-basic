package cn.school.thoughtworks.section2;

import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

import java.util.*;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        Set<String> uniquest=new HashSet<>(collection1);
        for (String key:uniquest)
        {
            if(key.length()>1)
            {
                String str="";
                int num=0;
                if(key.contains(":") || key.contains("-"))
                {
                    String[] str1={};
                    if(key.contains(":"))
                        str1=key.split(":");
                    else
                        str1=key.split("-");
                    str=str1[0];
                    num=Integer.parseInt(str1[str1.length-1]);
                }
                if(key.contains("["))
                {
                    int start=key.indexOf("[");
                    int end=key.indexOf("]");
                    num=Integer.parseInt(key.substring(start+1,end));
                    str=key.substring(0,1);
                }
                if(result.containsKey(str))
                    result.put(str,result.get(str)+num);
                else
                    result.put(str,num);
            }
            else
            {
                if(result.containsKey(key))
                    result.put(key,result.get(key)+Collections.frequency(collection1,key));
                else
                    result.put(key,Collections.frequency(collection1,key));
            }
        }
        return result;
    }
}
