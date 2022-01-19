package oop.accessModifiers.staticAndFinalKeywords;

class Apple {

    public Apple(){
        // new Apple.Apple()
    }

    //instance variables
    public String shape;
    public double weight;
    public String color;
    public String taste;

    //it is a member of Apple
    static class RedApple extends Apple{

        public RedApple(){

        }
        public static final String color = "red";
    }

    static class GreenApple{
        public static final String color = "green";
    }


    public static void main(String[] args) {
        System.out.println(RedApple.color); // red

        RedApple r1 = new RedApple();
    }
}