package day3;

public class Monster implements Damagable{

    private String name;
    private int hitPoints;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHitPoint() {
        return hitPoints;
    }
    public void setHitPoint(int hitPoint) {
        this.hitPoints = hitPoint;
    }

    public void damage(int amt){
        this.hitPoints-=amt;
    }
    public int getDamage(){
        return this.hitPoints;
    }
    @Override
    public String toString(){
        return String.format("Monster{name =%s, hitPoint=%d}",name,hitPoints);
    }
}