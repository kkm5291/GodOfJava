package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentlist = new ArrayList<>();
        studentlist.add(new StudentDTO("요다", 43, 99, 10));
        studentlist.add(new StudentDTO("찐빵", 30, 71, 85));
        studentlist.add(new StudentDTO("건빵", 32, 81, 75));
//        sample.printStudentNames(studentlist);
//        sample.printStudentAges(studentlist);

        List<String> name = List.of("경모", "공덕", "엄마", "아빠", "누님");

        name.stream().forEach(eachName -> System.out.println(eachName));

        List<String> nameList = studentlist.stream().map(student->student.getName()).collect(Collectors.toList());
//        studentlist.stream().map(student->student.getName()).forEach(System.out::println);

//        for (String name : nameList) {
//            System.out.println(name);
//        }


    }

    public void printStudentNames(List<StudentDTO> students) {
//        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));
    }

    public void printStudentAges(List<StudentDTO> students) {
        students.stream().map(student -> student.getAge()).forEach(age -> System.out.println(age));
    }
}
