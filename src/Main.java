public class Main {
    public static void main(String[] args) {
        int money1 = 29000; //Задача 1
        int total2 = 0;
        for (int i = 0; i < 12; i++) {
            total2=total2+total2/100;
            total2 = total2 + money1;
            System.out.println("Месяц " + i + " сумма накоплений равна" + total2 + " рублей");
        }
    }
}