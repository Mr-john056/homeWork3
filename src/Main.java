public class Main {
public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        }

    public static void task1 () {
        byte a = 126;
        short b = 1260;
        int c = 126000;
        long d = 12600000;
        float e = 1.5f;
        double f = 2.5678;
        char g = 35672;
        boolean h = true;

        System.out.println("Задача 1");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println();
}

    public static void task2 () {
        double a = 27.12;
        long b = 987678965549l;
        float c = 2.786f;
        char d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println("Задача 2");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println();
    }

    public static void task3 () {
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        short totalSheets = 480;
        int totalStudents = classOne + classTwo + classThree;
        int studentSheet = totalSheets / totalStudents;
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + studentSheet + " листов бумаги");
        System.out.println();
    }

    public static void task4 () {
        byte bottlesTwoMinutes = 16;
        byte startTimeMinutes = 2;
        byte oneMinutes = 1;
        byte twentyMinutes = 20;
        short oneDayMinutes = 1440;
        short threeDayMinutes = 4320;
        int oneMonthMinutes = 43200;
        int bottles1_Minutes = bottlesTwoMinutes / startTimeMinutes;
        int bottlesTwentyMinutes = bottles1_Minutes * twentyMinutes;
        int bottlesOneDay = bottles1_Minutes * oneDayMinutes;
        int bottlesThreeDay = bottles1_Minutes * threeDayMinutes;
        int bottlesOneMonth = bottles1_Minutes * oneMonthMinutes;

        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + bottlesTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesOneMonth + " штук бутылок");
        System.out.println();
    }

    public static void task5 () {
        byte totalCans = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int cansPerClass = whiteColor + brownColor;
        int totalClasses = totalCans / cansPerClass;
        int totalWhiteColor = totalClasses * whiteColor;
        int totalBrownColor = totalClasses * brownColor;

        System.out.println("Задача 5");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски");
        System.out.println();
    }

    public static void task6 () {
        byte gramsOneBanana = 80;
        byte gramsOneHundredMilk = 105;
        byte iceCreamGramms = 100;
        byte oneEggGramm = 70;
        int recipeInGramm = (gramsOneBanana * 5) + (gramsOneHundredMilk * 2) + (iceCreamGramms * 2) + (oneEggGramm * 4);
        float recipeInKilogramm = recipeInGramm / 1000f;
        System.out.println("Задача 6");
        System.out.println("Вес спортзавтрака спортсмена составляет: " + recipeInGramm + " граммов, или " + recipeInKilogramm + " килограмм");
        System.out.println();
    }

    public static void task7 () {
        byte a = 126;
        short b = 1260;
        int c = 126000;
        long d = 12600000;
        float e = 1.5f;
        double f = 2.5678;
        char g = 35672;
        boolean h = true;

        System.out.println("Задача 1 - инициализация переменных");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    public static void task8 () {
        byte a = 126;
        short b = 1260;
        int c = 126000;
        long d = 12600000;
        float e = 1.5f;
        double f = 2.5678;
        char g = 35672;
        boolean h = true;

        System.out.println("Задача 1 - инициализация переменных");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}