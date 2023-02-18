package ex14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ex14.entity.GoodStudent;
import ex14.entity.NormalStudent;
import ex14.entity.Student;

public class StudentManagement {
  private List<Student> students;

  public StudentManagement() {
    students = new ArrayList<>();
  }

  public void addNewStd(Student student) {
    this.students.add(student);
  }

  // filter passed student
  public List<Student> chooseStudent(int number) {
    List<Student> passedStudent = null;
    long goodStdNumber = this.students.stream().filter(o -> o instanceof GoodStudent).count();
    // number of good student is greater than required number
    if (goodStdNumber > number) {
      List<Student> goodStudents = this.students.stream().filter(o -> o instanceof GoodStudent)
          .collect(Collectors.toList());
      Collections.sort(goodStudents, new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
          int result = 2;
          result = ((GoodStudent) o2).getGpa() - ((GoodStudent) o1).getGpa();

          if (result == 0) {
            return o1.getFullName().compareTo(o2.getFullName());
          } else {
            return result;
          }
        }
      });
      passedStudent = new ArrayList<>(goodStudents.subList(0, number));
    } else if (goodStdNumber < number) {
      passedStudent = this.students.stream().filter(o -> o instanceof GoodStudent).collect(Collectors.toList());
      List<Student> normalStd = this.students.stream().filter(o -> o instanceof NormalStudent)
          .collect(Collectors.toList());
      Collections.sort(normalStd,
          new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
              int result = 2;
              result = ((NormalStudent) o2).getEntryTestScore() - ((NormalStudent) o1).getEntryTestScore();
              int result1 = 2;

              if (result == 0) {
                result1 = ((NormalStudent) o2).getEnglishScore() - ((NormalStudent) o1).getEnglishScore();
              }

              if (result1 == 0) {
                return o1.getFullName().compareTo(o2.getFullName());
              } else
                return result1;
            }
          });
      passedStudent.addAll(normalStd.subList(0, number - (int) goodStdNumber));
    } else if ((int) goodStdNumber == number) {
      passedStudent = this.students.stream().filter(o -> o instanceof GoodStudent).collect(Collectors.toList());
    }
    return passedStudent;
  }

  public void filterByPhoneNumber() {
    Collections.sort(this.students, new SortByPhoneNumber());
    this.students.forEach(o -> System.out.println(o.showMyInfor()));
  }

  public void filterByFullName() {
    Collections.sort(this.students, new SortByFullName());
    this.students.forEach(o -> System.out.println(o.showMyInfor()));
  }

  private class SortByFullName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o1.getFullName().compareTo(o2.getFullName());
    }
  }

  private class SortByPhoneNumber implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o2.getPhoneNumber().compareTo(o1.getPhoneNumber());
    }
  }
}
