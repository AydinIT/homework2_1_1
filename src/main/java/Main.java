public class Main {
    public static void main(String[] args) {
       Bird objectA = new Bird("Jack", 3, "Sparrow", Size.SMALL, new WhereLive("Asia", "Forest"));
       Eagle objectB = new Eagle("Paul", 2, "Eagle", Size.MEDIUM, new WhereLive("North America", "steppes"), true);
       Eagle objectC = new Eagle("Logan", 7, "Eagle", Size.LARGE, new WhereLive("North America", "mountains"), false);

       objectA.fly();
       objectA.fly(120);
       System.out.println(objectA.printInfo());

       System.out.println("------------------------");

       objectB.fly();
       objectB.fly(30);
       System.out.println(objectB.printInfo());

       System.out.println("------------------------");

       objectC.fly();
       objectC.fly(300);
       System.out.println(objectC.printInfo());
    }
}