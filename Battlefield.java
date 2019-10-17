import ru.ifmo.se.pokemon.*;

public class Battlefield {
    public static void main(String[] args) {
        Battle field = new Battle();
        field.addAlly(new Terrakion ("PeePee", 99));
        field.addAlly(new Archen("PooPoo", 99));
        field.addAlly(new Nidorino("Oopsie",99));
        field.addFoe(new Archeops("Doopse", 99));
        field.addFoe(new Nidoran_M("Sven", 99));
        field.addFoe(new Nidoking("Jorgen", 99));
        field.go();
    }
}
