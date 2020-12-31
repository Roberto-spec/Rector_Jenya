import java.util.Arrays;
import java.util.Scanner;

public class University {
    private Student[] students;
    private float average_mark;
    private int index_best_student;
    private String name_organization;
    //Конструктор класса Университет
    University(int count_mark, int count_students, String name_organization){
        this.name_organization=name_organization;
        this.students=pervoe_sentyabrya(count_mark,count_students);
        this.index_best_student=find_best(students);
        this.average_mark=calc_average_mark(students);
    }



    //Добавляет студентов в университет
    private Student[] pervoe_sentyabrya(int count_mark, int count_students){
        Interface inter=new Interface();
        Student[] s=new Student[count_students];
        for (int b=0;b<count_students;b++){
            s[b]=new Student(inter.students_name(b+1),count_mark);
        }
        return s;
    }
    //Ищет лучшего студента
    private int find_best(Student[] s){
        int i=0;
        float m=0;
        for (int b=0;b<s.length;b++){
            if(m<s[b].getMedium())
            {
                i=b;
                m=s[b].getMedium();
            }
        }
        return i;
    }

    //Считает среднюю оценку университета
    private float calc_average_mark(Student[] s){
        int a=0;
        for (int b=0;b<s.length;b++){
            a+=s[b].getMedium();
        }
        a=a/s.length;
        return a;
    }

    public float getAverage_mark() {
        return average_mark;
    }

    public int getIndex_best_student() {
        return index_best_student;
    }

    public String getName_organization() {
        return name_organization;
    }

    public Student[] getStudents() {
        return students;
    }

//    @Override
//    public String toString() {
//        return "University{" +
//                "students=" + Arrays.toString(students) +
//                ", average_mark=" + average_mark +
//                ", index_best_student=" + index_best_student +
//                ", name_organization='" + name_organization + '\'' +
//                '}';
//    }
}
