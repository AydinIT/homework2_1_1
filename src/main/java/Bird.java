public class Bird extends Animal {

    private String species;
    private Size size;
    private WhereLive whereLive;

    public Bird(String name, int age, String species, Size size, WhereLive whereLive) {
        super(name, age);
        this.species = species;
        this.size = size;
        this.whereLive = whereLive;
    }

    public String getSpecies() {
        return species;
    }

    public Size getSize() {
        return size;
    }

    public WhereLive getWhereLive() {
        return whereLive;
    }

    public final void fly(){
        System.out.println(this.getName() + " is flying!");
    }

    public void fly(int seconds){
        System.out.println(this.getName() + " flew for " + seconds + " seconds!!!");
    }

    public String  printInfo(){
        return "Name: " + this.getName() +" \nage: " + this.getAge() + " \nspecies: " + this.getSpecies() + " \nsize: " + this.getSize() + " \ncontinent: " + this.getWhereLive().getContinent() + " \nhabitat: " + this.getWhereLive().getHabitat();
    }

}
