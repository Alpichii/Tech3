package singleton;

public class Diamond {

    private static final Diamond diamond = new Diamond();

    private Diamond(){

    }

    public static Diamond getDiamond(){
        return diamond;
    }

}