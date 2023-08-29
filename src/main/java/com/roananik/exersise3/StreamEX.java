package com.roananik.exersise3;

import java.util.*;

public class StreamEX {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 4, 5, 2};
        int[] res = Arrays.stream(Arrays.stream(Arrays.stream(arr).map((e) -> {
                    if (e > 4) {
                        e = e / 4;
                    }
                    return e;
                }).toArray())
                .filter((e) -> e == 1).toArray()).toArray();

        Arrays.stream(arr).forEach(Utils::met);


        System.out.println(Arrays.toString(res));

        int result = Arrays.stream(arr).reduce((a,e)->a+e).getAsInt();//метод работает с элементами
        System.out.println(result);//можно прибавить умножить поделить
        //удобно искать сумму всех элементов

       List<Integer> arrays=new ArrayList<>();
        Optional o = arrays.stream().reduce((a, e)->a*e);
        if(o.isPresent()){//проверяет что что то присутствует что не null
            System.out.println(o);
        }else {
            System.out.println("Empty");//если лист пустой вернет сообщение а не ошибку
        }

        int result2 = Arrays.stream(arr).reduce(1,(a,e)->a+e);//если передать значение начальное для а
        System.out.println(result2);// то уже есть значение и проверят на пустот уне нужно

    }
}

class Utils {
    public static void met(int a) {
         a = a + 5;
        System.out.println("Element: "+a);

    }
}
