public final class Eagle extends Bird{

    private boolean isHeadWhite;

    public Eagle(String name, int age, String species, Size size, WhereLive whereLive, boolean isHeadWhite) {
        super(name, age, species, size, whereLive);
        this.isHeadWhite = isHeadWhite;
    }

    public boolean isHeadWhite() {
        return isHeadWhite;
    }

    @Override
    public String printInfo(){
        return super.printInfo() + "\nis head white: " + (isHeadWhite ? "yes" : "no");
    }

}
