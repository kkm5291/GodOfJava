package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();
        List<StudentDTO> studentlist = new ArrayList<>();
        studentlist.add(new StudentDTO("요다", 43, 99, 10));
        studentlist.add(new StudentDTO("찐빵", 30, 71, 85));
        studentlist.add(new StudentDTO("건빵", 32, 81, 75));
        sample.filterWithScoreForLoop(studentlist, 80);
    }

    private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
//        for (StudentDTO student : studentList) {
//            if (student.getScoreEnglish() > scoreCutLine) {
//                System.out.println(student.getName());
//            }
//        }+-+

        studentList.stream().filter(student -> student.getScoreEnglish() > 80).forEach(student -> System.out.println(student.getName()));
    }


}
