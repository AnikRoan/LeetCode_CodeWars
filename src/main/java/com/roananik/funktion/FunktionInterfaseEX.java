package com.roananik.funktion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class FunktionInterfaseEX {
    static int x = 5;

    static void run(Runnable r) {
        r.run();
    }


    public static void main(String[] args) {


        Consumer<String> f = (v) -> {//ничего не возвращает и что то делает с поступившим
            String d = v + "sokol";
            System.out.println(d);
        };

        f.accept("Tor");

        Supplier<Integer>supl = ()->(int)45/2;//ничего не принимает и возвращает результат чего то  там
        int result = supl.get();

        Function<String,String> strin =(xx)->xx+xx;//принимает Т возвращает R и что то делает с Т
        String ser = strin.apply("KOLOKOL");
        System.out.println(ser);


       Predicate<Integer>pred=(e)->e>0;//возвращает true false
       pred.test(-3);
               //pred.and(pred2) вернет тру если оба тру
               //pred.or(pred2) вернет тру если хотябы один тру
               //pred.negate() вернет тру если pred был фолс

        UnaryOperator<String>unar =(d)->d.toLowerCase();//принимает Т возвращает что и принимает
        unar.apply("YUIL");//наследуется от Function<T,R>

        BinaryOperator<Integer>bini =(a,b)->a+b;//принимает два аргумента возвращает 1
        bini.apply(1,2);

        BiFunction<Integer,String,String>bi = (a,b)->a+b;//принимает 2 параметра возвращает 1
        bi.apply(2,"roki");









        String l = Stream.of("1", "2", "3", "4", "5", "6")
                .mapToInt(Integer::parseInt)
                .summaryStatistics().toString();//выводит среднее сумму мин макс и количество
        System.out.println(l);


        Predicate<String> str = "Java"::equals;// сравнит то что поступит в тест
        System.out.println(str.test("Java"));
        //чтобы менять значения в лямбде нужен static
        // и нужна переменная например в цикде
        List<IntSupplier> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            x++;
            int y = x;
            IntSupplier s = () -> y * y;
            list.add(s);
        }
        for (IntSupplier intSupplier : list) {
            System.out.println(intSupplier.getAsInt());

        }


        Runnable r = () -> System.out.println("Hello World");//запись лямбда выражения
        r.run();
        run(() -> System.out.println("Kool"));//через метод который принимает интерфейс
        Object o = (Runnable) (() -> System.out.println("Magija"));//если нужно вернуть а тип неоперделен


    }


}
