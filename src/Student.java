import java.util.Arrays;

public class Student {
    private String name;
    private float medium;
    private int[] marks;
    //Конструтор класса студент - на выходе получаем готового бойца
    Student(String name,int count){
        this.name=name;
        this.marks=random_marks(count);
        this.medium=average(this.marks);

    }
    //Заполняет дномерный массив длинной count числами от 1 до 12
    private int[] random_marks(int count){
        int[] i=new int[count];
        for (int b=0;b<count;b++){
            i[b]=random();
        }
        return i;
    }
    //Генератор случайного числа от 1 до 12
    private int random(){
        return (int)(Math.random() * 12)+1;
    }
    //Подсчет среднего значение массива
    private float average(int[] markes){
        float m=0;
        for (int b=0;b<markes.length;b++){
            m+=markes[b];
        }
        m=m/markes.length;
        return m;
    }

    public float getMedium() {
        return medium;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", medium=" + medium +
//                ", marks=" + Arrays.toString(marks) +
//                '}';
//    }
}
