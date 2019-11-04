package lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

//        Stream<String> values = Stream.of("value1","value2","value3","value4","value5");
//        values.collect(ArrayList::new,ArrayList::add,ArrayList::addAll).forEach((System.out::println));

//----------------Collectors.toCollection(TreeMap)-------------------------

//        Stream<Order> orderStream = Stream.of(new Order(0,"context1"),new Order(1,"context2"));
//        orderStream.collect(Collectors.toMap(Order::getId, Order::getContext))
//                .forEach((key,value) -> System.out.printf("Key: %d,value: %s %n", key, value));

//----------------Collectors.toCollection(TreeSet)--------------------------

//        Stream<String> values = Stream.of("value1","value2","value3","value4","value5");
//        values.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

//----------------Collectors.toSet()-------------------------------

//        Stream<String> values = Stream.of("value1","value2","value3","value4","value5");
//        values.collect(Collectors.toSet()).forEach(System.out::println);


//---------------Collectors.toList()--------------------------------

//        Stream<String> values = Stream.of("value1","value2","value3","value4","value5");
//        values.collect(Collectors.toList()).forEach(System.out::println);

//--------------reduce---------------------------------------

//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
//        Optional<Integer> result = numbers.reduce((value1, value2) -> value1 + value2);
//        System.out.println(result.get());
//
//        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5);
//        int result2 = numbers2.reduce(10, (value1, value2) -> value1 + value2);
//        System.out.println(result2);
//
//        Stream<Integer> numbers3 = Stream.of(1, 2, 3, 4, 5);
//        int result3 = numbers3.reduce(0, (value1, value2) -> {
//            if (value2 < 5) {
//                return value1 + value2;
//            } else {
//                return value1;
//            }
//        }, (value1, value2) -> value1 + value2);
//
//        System.out.println(result3);
//    }

        //-------------max/min----------------------------------------

//    ArrayList<Ticket> tickets = new ArrayList<>();
//        tickets.add(newTicket("A",100));
//        tickets.add(newTicket("B",75));
//
//    Ticket minimumTicketPrice = tickets.stream().min(Ticket::compare).get();
//        System.out.printf("Minimum price of ticket class %s: $%d%n",minimumTicketPrice.getTicketClass(),minimumTicketPrice.getPrice());
//    Ticket maximumTicketPrice = tickets.stream().max(Ticket::compare).get();
//        System.out.printf("Maximum price of ticket class %s: $%d%n",maximumTicketPrice.getTicketClass(),maximumTicketPrice.getPrice());

//---------------------------count------------------------------

//        Stream<Integer>mixedstream = Stream.of(-2,-1,0,1,2);
//        System.out.println(mixedstream.count());
//        System.out.println(mixedstream.min());


//        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Pepperoni","500"));

//------------------------map-----------------------------------------------------

//        Stream<Film> filmStream = Stream.of(new Film("Avengers","700000"),new Film("DeadPool2","400000"));
//        //filmStream.map(Film::getTitle).forEach(s -> System.out.println(s));
//        filmStream.map(Film::getPrice).forEach(s -> System.out.println(s));
//-----------------------skip/limit-----------------------------------------------
//        Stream<String> stream = Stream.of("Value1","Value2","Value3","Value4","Value5","Value6");
////        stream.skip(2).forEach(s -> System.out.println(s));
//        stream.limit(5).forEach(s -> System.out.println(s));

//------------------------filter---------------------------------------

//        Stream<String> passwords = Stream.of("12sd12sdf","435fd2343","12dsf");
//        passwords.filter(password->password.length() >=7).forEach(s -> System.out.println(s));

//        ArrayList<String> names =  new ArrayList<>();
//      Collections.addAll(names,"Max","Kris","Miya");
//      names.stream().filter(s -> s.length()<=3).forEach(s -> System.out.println(s));

//--------------------forEach------------------------------------------

//        Stream<String> stringStream = Stream.of("a","b","c");
//        stringStream.forEach(s -> System.out.println(s));
//
//        IntStream intStream = IntStream.of(1,2,3);
//        intStream.forEach(s-> System.out.println(s));
//
//        LongStream longStream = LongStream.of(12,23,34);
//        longStream.forEach(s-> System.out.println(s));
//
//        DoubleStream doubleStream = DoubleStream.of(10.0,12.0,45.0);
//        doubleStream.forEach(s-> System.out.println(s));
//        Stream<String> objectStream = Arrays.stream((new String[]{"a","b","c"}));
//        objectStream.forEach(s -> System.out.println(s));

//        int[]numbers = {-2,-1,0,1,2};
//
//        for(int number:numbers){
//            if (number < 0) System.out.println(number);
//        }
//        IntStream.of(-2,-1,0,1,2).filter(value -> value < 0).forEach(s-> System.out.println(s));

//            List<String> list = new ArrayList<>();
//            list.add("one");
//            list.add("two");
//
//            Set<String> set = list.stream().filter(s -> s.equals("one")).collect(Collectors.toSet());
//            Set<String> stringSet = list.stream().collect(Collectors.toSet());
//
//            Stream.of("one","two").collect(Collectors.toSet());
//            int value = Stream.of(1,2).min(Comparator.comparing(s ->s)).get();
//            int valuemax  =Stream.of(1,2).max(Comparator.comparing(s ->s)).get();

    }
}


