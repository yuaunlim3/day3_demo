package day3;

public class Godzila extends Monster {
    
    public Godzila(){
        setName("Godzila");
        setHitPoint(1000);
    }
    @Override
    public void damage(int damage){
        int hitPoints = getHitPoint();
        setHitPoint(hitPoints - damage + 1);
    }
}
