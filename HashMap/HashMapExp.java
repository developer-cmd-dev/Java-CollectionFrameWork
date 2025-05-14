package HashMap;

import java.util.*;

enum Students {
    Naman,Vaidehi,Neha,Megha,Dev
        }

public class HashMapExp {
    public static void main(String[] args) {
        Map<Integer,Students> map = new HashMap<>();

        for (int i = 0; i <Students.values().length ; i++) {
            map.put(i,Students.values()[i]);
        }


        Map<Student,Integer> data = new HashMap<>();
        List<String>names = Arrays.asList("Naman","Vaidehi","Neha","Megha","Dev");
        List<Integer>id = Arrays.asList(2,5,7,9,6);
        List<Integer>marks = Arrays.asList(440,500,300,600,800);

        for (int i = 0; i <names.size() ; i++) {
            Student student = new Student(names.get(i),id.get(i));
            data.put(student,marks.get(i));
        }

        System.out.println(data);





    }
}
