//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1

        int firstFriday = 1;
        for (int i = 1; i <= 31; i += 7) {
            System.out.println("Сегодня пятница," + i + " число.Необходимо подготовить отчет");
        }
        System.out.println("\n" + "Задание 2/1:" + "\n");
        // Задание 2

        int distance1 = 42195;
        do {
            System.out.println("Держись,осталось " + distance1 + " метров");
            distance1 -= 500;

        } while (distance1 >= 0);

        System.out.println("\n" + "Задание 2/2:" + "\n");
        // Задание 2 версия через for

        int totalDistance=42195;
        for (int distance = 0; distance <= 42195;distance+=500 ) {
            System.out.println("Держись,осталось " + totalDistance+" метров");
            totalDistance -= 500;
            if (totalDistance<=0){
                break;
            }

        }


        System.out.println("\n" + "Задание 3/1:" + "\n");

// Задание 3
        int totalMany = 1000;
        int cost = 100;
        int day = 1;

        while (true) {
            if (day % 5 == 0) {
                System.out.

                        println(day + " — Бесплатно");

                day++;
                continue;
            }

            if (totalMany >= cost) {
                totalMany -= cost;
                System.out.

                        println(day + " — платно, остаток: " + totalMany);
            } else {
                System.out.

                        println("На день " + day + " оплата невозможна — недостаточно средств.");
                break;
            }

            day++;
        }

        System.out.

                println("\n" + "Задание 3/2:" + "\n");
// Задание 3 версия через for

        int totalMany1 = 1000;
        int cost1 = 100;

        for (
                int day1 = 1;
                ; day1++) {
            if (day1 % 5 == 0) {
                System.out.

                        println(day1 + " — Бесплатно");
                continue;
            }

            if (totalMany1 >= cost1) {
                totalMany1 -= cost1;
                System.out.

                        println(day1 + " — платно, остаток: " + totalMany1);
            } else {
                System.out.

                        println("На день " + day1 + " оплата невозможна — недостаточно средств.");
                break;
            }
        }

        System.out.

                println("\n" + "Задание 4:" + "\n");

// Задание 4
        int total1 = 0;
        int month = 0;
        while (true) {
            total1 = total1 + 15000;
            month++;
            System.out.

                    println("Месяцев " + month + " понадобиться,чтобы накопить " + total1 + " рублей");

            if (month % 6 == 0) {
                total1 += total1 * 0.07;


            } else if (total1 >= 12_000_000) {
                break;

            }
        }
        System.out.

                println("\n" + "Задание 5:" + "\n");

// Задание 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (true) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.

                        println("Перегрев." +
                                "Зарядка приостановлена на 2 минуты.Текущий заряд " + charge + "%");

                minute += 2;
                continue;
            }
            if (overheats == 3) {
                System.out.

                        println("Зарядка прекращена.Текущий " +
                                "заряд " + charge + " %.Время зарядки составило " + minute + " минут");
                break;
            } else {
                charge += 2;
            }

        }


    }
}