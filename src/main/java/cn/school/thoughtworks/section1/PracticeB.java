package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result=new ArrayList<>();

        for (int i=0;i<collection1.size();i++)
        {
            String a=collection1.get(i);
            if(collection2.get(0).contains(a))
                result.add(a);
        }

        return result;
    }
}
