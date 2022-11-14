import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляю с совершенноолетием ");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, подожди немного");
        }

        //Задание №2
        int age0 = 23;
        if (age0 >= 7 && age0 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age0 >= 18 && age0 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age0 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Задание №3
        int totalSeats = 102;
        int seat = 60;
        int standingSeats = totalSeats - seat;

        int occupiedSeat = 51;
        int occupiedStandingSeats = 42;

        if (occupiedSeat + occupiedStandingSeats == totalSeats) {
            System.out.println("Все места заняты");
        }
        if (occupiedSeat < seat) {
            System.out.println("Свободных сидячих мест осталось " + (seat - occupiedSeat));
        }
        if (occupiedStandingSeats < standingSeats) {
            System.out.println("Свободных стоячих мест осталось " + (standingSeats - occupiedStandingSeats));
        }

        //Задание №4
        int age1 = 20;
        if (age1 >= 18) {
            System.out.println("Поздравляю с совершенноолетием ");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, подожди немного");
        }

        //Задание №5
        int age2 = 23;
        if (age2 >= 7 && age0 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Задание №6
        int totalSeats0 = 102;
        int seat0 = 60;
        int standingSeats0 = totalSeats - seat;

        int occupiedSeat0 = 51;
        int occupiedStandingSeats0 = 42;

        if (occupiedSeat0 + occupiedStandingSeats0 == totalSeats0) {
            System.out.println("Все места заняты");
        }
        else {
            System.out.println("Свободных сидячих мест осталось " + (seat - occupiedSeat));
            System.out.println("Свободных стоячих мест осталось " + (standingSeats - occupiedStandingSeats));
        }


        //Задание №7
        int ageHuman = 13;
        boolean kindergarten = ageHuman >=2 && ageHuman <= 6;
        boolean school = ageHuman >= 7 && ageHuman <= 18;
        boolean universety = ageHuman >= 18 && ageHuman <= 24;
        boolean job = ageHuman >24;

        if (kindergarten) {
            System.out.println("Если человеку " + ageHuman + " лет, то ему нужно ходить в детский сад");
        } else if (school) {
            System.out.println("Если человеку " + ageHuman + " лет, то ему нужно ходить в школу");
        } else if (universety) {
            System.out.println("Если человеку" + ageHuman + " лет, то его место в университете");
        } else if (job) {
            System.out.println("Если человеку " + ageHuman + " лет, то ему пора ходить на работу");
        }

        //Задание №8
        int ageChild = 7;
        boolean canNot = ageChild < 5;
        boolean maydeAccompanied = ageChild > 5 && ageChild < 14;
        boolean independently = ageChild > 14;

        if (canNot) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (maydeAccompanied) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else if (independently) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        //Задание №9
        int one = 4;
        int two = 7;
        int free = 2;

        if (one > two && one > free) {
            System.out.println("1 число больше остальных");
        } else if (two > one && two > free) {
            System.out.println("2 число больше остальных");
        }
        else {
            System.out.println("3 число больше остальных");
        }
    }
    }
