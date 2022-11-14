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


    }
}