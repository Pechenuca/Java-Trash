import ru.ifmo.se.pokemon.*;
public class Nidoking extends Nidorino {
    public Nidoking(String name, int level){
        super(name, level);
        setStats(81, 102, 77, 85, 75 ,85);
        setType(Type.POISON, Type.GROUND);

    }
}
