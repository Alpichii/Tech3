package oop.oop_part2.inheritance;

public class Food {

    //instance variables, methods, constructors, blocks

    //Default constructor
    public Food(){

    }

    //Custom constructor
    public Food(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    //instance variables
    public static final boolean tangible = true; // constant

    public String taste;
    public String name;
    protected boolean isSpicy;
    boolean isSweet;
    private boolean isOrganic;

    //Provide public setter and getter for isOrganic()

    public boolean getIsOrganic() {
        return isOrganic;
    }

    public void setIsOrganic(boolean organic, String license) { // 1234
        if(license.equals("1234")) isOrganic = organic;
        else throw new IllegalArgumentException("License entered is not allowed to decide!!!");
    }

    @Override
    public String toString() {
        return "Food{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isSweet=" + isSweet +
                ", isOrganic=" + isOrganic +
                '}';
    }
}