package day3;

public class Box implements Damagable {
    private int integrity = 3;

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public void damage(int damage){
        integrity -= damage;
    }

    public int getDamage(){
        return this.integrity;
    }
    @Override
    public String toString(){
        return String.format("Box{hitPoint=%d}",integrity);
    }
}
