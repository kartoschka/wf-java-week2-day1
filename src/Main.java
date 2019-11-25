import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        switch(new Scanner(System.in).nextInt()) {
            case 1: ex_person(); break;
            case 2: ex_bankAccount(); break;
            case 3: ex_time(); break;
        }
    }

    private static void ex_time() {
        Time[] examples = {
                new Time(23, 15, 55),
                new Time(10, 39, 5),
                new Time(3, 0, 0),
                new Time(7, 30, 0)
        };
    }

    private static void ex_bankAccount() {
        BankAccount acc = new BankAccount(1234.56);
        acc.report();
        acc.setMinBalance(-500);
        acc.report();
        acc.withdraw(330);
        acc.report();
        acc.deposit(220);
        acc.report();
        acc.withdraw(1000);
        acc.report();
        if (!acc.withdraw(1000)) System.out.println("withdraw returned false");
        acc.report();
        acc.withdraw(500);
        acc.report();
    }

    private static void ex_person() {
        Person[] examples = {
                new Person("(first name)", "(last name)"),
                new Person("Gorgorog", "Farkdork"),
                new Person("Okdong", "Bronkovonk"),
                new Person("Ork", "Orkov"),
                new Person("Orkok", "Orekrok"),
                new Person("Brekko", "Orkvek")
        };

        for (Person p : examples) {
            System.out.println(p.formatFullName());
        }
    }
}
