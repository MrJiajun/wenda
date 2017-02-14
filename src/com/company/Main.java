package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void print(int index, Object object)
    {
        System.out.println(String.format("{%d}, %s", index, object.toString()));
    }

    public static void demoOperation()
    {
        print(1,5+2);
        print(2,5-2);
        print(3,5*2);
        print(4,5/2);
        print(4,5%2);
        print(5,5>>2);
        print(6,5<<2);
        print(7,5|2);
        print(8,5^2);
        print(9,5==2);
        print(10,5!=2);
        print(11,5.0/2);
        print(12,5/2.0);
    }

    public static void demoStrirng(){
        String str = "hello world";
        print(1,str.indexOf('e'));//某个字符在字符串的位置，若不存在则返回-1；
        print(2,str.charAt(3));//str[1]
        print(3,str.codePointAt(1));
        print(4, str.compareToIgnoreCase("HELLO WORLD"));
        print(5, str.compareTo("hello uorld"));
        print(6, str.compareTo("hello xorld"));
        print(7, str.contains("hello"));
        print(8, str.concat("!!!"));
        print(9, str.toUpperCase());
        print(10, str.endsWith("world"));
        print(11, str.startsWith("hello"));
        print(12, str.replace('0','e'));
        print(13, str.replaceAll("o|l", "a"));
        print(14, str.replaceAll("hello","hi"));
        print(15,str+str);

        StringBuilder sb = new StringBuilder();//对字符串做随机操作，但是这个类是线程非安全的
        sb.append("x");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        print(16,sb.toString());

    }

    public static void demoControlFlow(){
        int a = 2;
        int target = a == 2 ? 1 : 3;
        print(1,target);


        String grade = "B";
        switch(grade){
            case "A":
                print(2,">80");
                break;
            case "B":
                print(3,"60-80");
                break;
            case "c":
                print(4, "<60");
                break;
            default:
                print(6,"unknown");
                break;
        }

        for(int i = 0; i < 4; i++)
        {
            if(i == 0)
            {
                continue;
            }
            print(7, i );
            if(i == 2)
                break;
        }

        int score = 60;
        while(score <= 100)
        {
            print(8,score);
            score += 20;
        }
    }

    public static void demoList()
    {
        List<String> strlist = new ArrayList<String>(10);
        for(int i = 0; i < 4; i++)
        {
            strlist.add(String.valueOf(i));
        }
        print(1, strlist);

        List<String> strlistB = new ArrayList<String >(10);
        for(int i = 0; i < 4; i++)
        {
            strlistB.add(String.valueOf(i * i));
        }
        print(2, strlistB);

        strlist.remove(0);
        print(3, strlist);

        strlist.remove(String.valueOf(1));
        print(4, strlist);

        print(5,strlist.get(1));

        Collections.reverse(strlist);
        print(6,strlist);

        Collections.sort(strlist);
        print(7, strlist);

        Collections.sort(strlist, new Comparator<String>(){
            @Override
            public int compare(String o1 , String o2)
            {
                return o2.compareTo(o1);
            };
        });
        print(8, strlist);

        for(String obj: strlist){
            print(9, obj);
        }

        for(int i = 0; i < strlist.size(); i++)
        {
            print(10, strlist.get(i));
        }

        int [] array = new int [] {1, 2, 3};
        print(11, array[1]);
    }

    public static void demoMap(){
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < 4; i++)
        {
            map.put(String.valueOf(i), String.valueOf(i*i));
        }

        for(Map.Entry<String, String> entry:map.entrySet())
        {
            print(2,entry.getKey() + "|" + entry.getValue());
        }

        print(3, map.values());
        print(4,map.keySet());
        print(5,map.get("3"));
        print(6, map.containsKey("A"));

        map.replace("3", "27");
        print(7,map.get(3));
    }

    public static void demoSet(){
        Set<String > strset = new HashSet<String>();
        for(int i = 0;i < 3; i++)
        {
            strset.add(String.valueOf(i));
            strset.add(String.valueOf(i));
            strset.add(String.valueOf(i));
        }
        print(1,strset);

        strset.remove(String.valueOf(1));
        print(2,strset);
        print(3,strset.contains(String.valueOf(1)));
        print(4, strset.isEmpty());
        print(5,strset.size());

        strset.addAll(Arrays.asList(new String[]{"A","B","C"}));
        print(6,strset);
        for(String value:strset)
        {
            print(7,value);
        }
    }

    public static void demoException(){
        try{
            //XXXXX
            int k = 2;
            if( k == 2){
                throw new Exception("故意的!");
            }
        }catch(Exception e){
            print(2,e.getMessage());
        }finally{
            print(3,"finally");
        }
    }

    public static void demoOOP(){
        Animal a = new Animal("Jim",2);
        a.say();

        Animal human = new Human("lei",12,"China");
        human.say();
    }

    public static void main(String[] args) {
        /**
         * @param index
         * @param object
         */
        // write your code here
        //print(1, "hello world!");
        demoOperation();
        System.out.println("\n");
        demoStrirng();
        System.out.println("\n");
        demoControlFlow();
        System.out.println("\n");
        demoList();
        System.out.println("\n");
        /*demoMap();
        System.out.println("\n");*/
        demoSet();
        System.out.println("\n");
        demoException();
        System.out.println("\n");
        demoOOP();
        System.out.println("\n");


        return;
    }
}
