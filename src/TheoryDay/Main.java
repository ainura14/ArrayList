package TheoryDay;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(1, 100 + 1);
            arrayList.add(num);
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (Integer i : arrayList) {
            if(i % 2 == 0){
                arrayList1.add(i);
            }else{
                arrayList2.add(i);
            }
        }
        System.out.println(arrayList1);
        System.out.println(arrayList1.size());
        System.out.println("----------------------------------------------");
        System.out.println(arrayList2);
        System.out.println(arrayList2.size());
    }
}