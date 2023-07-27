public class Main {
    public static void main(String[] args) {
        int money = 15000; //Задача 1
        int total =0;
        int month =0;
        while  (total < 2_459_000) {
            int month1= month++;
            total = total + money;
            System.out.println("Месяц " + month1 + " сумма накоплений равна " + total + " рублей");
        }

        int a=0; // Задача 2
        while (a<10) {
            a=a+1;
            System.out.print(" " +a);
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print (" " +i );
            System.out.println();
        }

        int countryY = 12_000_000; // Задача 3
        int birthNumber =17;
        int deathNumber=8;
        int year =1;
        while (year<11) {
            int year1=year++;
            int leftBirthNumber=birthNumber-deathNumber;
            int totalNumber= leftBirthNumber*(countryY/1000);
            countryY= countryY+totalNumber;
            System.out.println("Год " + year1 + " численность населения составляет " + countryY);
            System.out.println();
        }
        int rub= 15000; //Задача 4
        int month1=1;
        int monthlyRevenue=7;
        for (month1=1; rub <12_000_000; month1++) {
            int rub1= rub/100*monthlyRevenue;
            rub=rub+rub1; {
                System.out.println("Месяц " + month1 + " сумма накоплений равна " + rub + " рублей");
            }
        }
        System.out.println();

        int rub2= 15000; //Задача 5
        int month2=1;
        int monthlyRevenue1=7;
        for (month2=1; rub2 <12_000_000; month2++) {
            int rub1 = rub2 / 100 * monthlyRevenue1;
            rub2 = rub2 + rub1;
            if (month2%6==0){
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + rub2 + " рублей");
            }
        }

        int rub3=15000; // Задача 6
        int totalMonth=9*12;
        int month3=1;
        int monthlyRevenue2=7;
        for (month3=1;month3<totalMonth;totalMonth++) {
            int rub4=rub3/100*monthlyRevenue2;
            rub3=rub3+rub4;
            if (month3%6==0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + rub3 + " рублей");
            }
        }

        int friday=5; // Задача 7
        int totalDays=31;
        for (friday=5;friday<totalDays;friday+=7) {
            System.out.println("Сегодня пятница " + friday+ " число. Необходимо подготовить отчет. ");
        }

        int nowYear=2023;// Задача 8
        int yearEarlier=nowYear-200;
        int yearLater=nowYear+100;
        for(yearEarlier=yearEarlier;yearEarlier<yearLater; yearEarlier++) {
            if (yearEarlier % 79 == 0) {
                System.out.println(yearEarlier);
            }
        }
    }
}