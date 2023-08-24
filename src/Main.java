import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Anna", LocalDate.of(2004,5,25), 19);
        Pessoa p2 = new Pessoa("Pedro", LocalDate.of(1999, 10, 3), 24);
        Pessoa p3 = new Pessoa("João", LocalDate.of(2002, 2, 12), 21);
        p1.status();
        p2.status();
        p3.status();
    }
}