package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result=new ArrayList<>();
        for(int i=0;i<collection1.size();i++)
        {
            String a=collection1.get(i);
            for(String value : collection2.keySet())
            {
                if(collection2.get(value).contains(a))
                    result.add(a);
            }
        }
        return result;
    }
}
