public class Main {
    public static void main(String args[])
    {
        Interface inter=new Interface();
        University university=new University(inter.ask2(), inter.ask1(), inter.ask3());
        inter.sliv(university);
    }
}
