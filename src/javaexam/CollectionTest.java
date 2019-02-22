package javaexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=45; i++){
            list.add(i);
        }

        Collections.shuffle(list);

        for(int i = 0; i<6;i++){
            System.out.println(list.get(i)+"\t");
        }
        System.out.println();

    }
}
