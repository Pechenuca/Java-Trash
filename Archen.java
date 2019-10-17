import ru.ifmo.se.pokemon.*;
public class Archen extends Pokemon {
    public Archen (String name, int level){
        super (name, level);
        setStats(55, 110, 45, 74, 45, 70);
        setType(Type.ROCK, Type.FLYING);


    }
}
