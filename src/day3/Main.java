package day3;

public class Main {
    public static void main(String[] args) {
        Monster m = new Monster();
        m.setName("Kaiju");
        m.setHitPoint(100);

        System.out.println(m.toString());

        Link link = new Link();
        link.hit(m);

        System.out.println(m.toString());

        Godzila g = new Godzila();
        
        System.out.println(g.toString());
        link.hit(g);
        System.out.println(g.toString());

        Box b = new Box();
        System.out.println(b.toString());
        link.hit(b);
        System.out.println(b.toString());


    }
}

