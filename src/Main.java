import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liczba zarejestrowanych osób "+Osoba.liczbaInstancji);

        Osoba osoba = new Osoba();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scanner.next();
        System.out.println("Podaj id");
        int id = scanner.nextInt();
        Osoba osoba1 = new Osoba(id,imie);

        System.out.println("Liczba zarejestrowanych osób "+Osoba.liczbaInstancji);

    }
}