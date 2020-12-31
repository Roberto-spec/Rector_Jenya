import java.util.Scanner;

public class Interface {
    //Обнародует данные университета
    public void sliv(University u){
        System.out.println("Университет - "+u.getName_organization());
        System.out.println("Список студентов");
        for (int i=0;i<u.getStudents().length;i++) if(i!=u.getIndex_best_student())show(u.getStudents()[i]);
        System.out.println("Лучший студент");
        show(u.getStudents()[u.getIndex_best_student()]);
        System.out.println("Средний бал университета - "+u.getAverage_mark());
    }
    //Используется для слива
    public void show(Student s){
        System.out.println("Студент "+s.getName());
        System.out.print("Оценки: ");
        for (int b=0;b<s.getMarks().length;b++){
            System.out.print(s.getMarks()[b]+", ");
        }
        System.out.println();
        System.out.println("Средний бал - "+s.getMedium());
    }
    //Спрашивает имя студента
    public String students_name(int i){
        Scanner scanner = new Scanner(System.in);
        String n;
        System.out.println("Как зовут студента №"+i+ "?");
        System.out.print(">_");
        n=scanner.nextLine();
        return n;
    }
    //Вопрос 1: Сколько студентов в университете
    public int ask1(){
        int i=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите количество студентов в новом университете:");
            System.out.print(">_");
            i=scanner.nextInt();
        }while (i<1);
        return i;
    }
    //Вопрос 2: Сколько оценок у каждого студента в университете
    public int ask2(){
        int i=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите количество оценок у каждого студента в университете:");
            System.out.print(">_");
            i=scanner.nextInt();
        }while (i<1);
        return i;
    }
    //Вопрос 3: Название университета
    public String ask3(){
        String s;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите название нового университета:");
            System.out.print(">_");
            s=scanner.nextLine();
        }while (s.length()<1);
        return s;
    }


}
