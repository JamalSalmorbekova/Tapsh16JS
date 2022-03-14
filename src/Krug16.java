public class Krug16 {
    private static final double PI = 3.14;
    private static int radius;

    public Krug16() {
    }

    public Krug16(int radius) {
        this.radius = radius;
    }

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Krug16.radius = radius;
    }

    public  static void ploshad(){
        System.out.println("Площадь равна пи кобойтулгон " +
                " айлананын  радиусунун  квадраты: " +PI*(radius*radius));
    }

    public static void tegerek(){
        System.out.println(" Окружность круга равна пи*2*радиус: "+ PI*2*radius);
    }
}
