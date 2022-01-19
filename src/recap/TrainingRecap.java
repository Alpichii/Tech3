package recap;

public class TrainingRecap {
    public static void main(String[] args) {

        int x = 8;
        int y = 5;
        int z = 5;



        if((x == y && x == z && y == z)){
            System.out.println("TRIPLE MATCH");
        }else if(x == y || x ==z || z== x || y==z){
            System.out.println("double match ");
        }else{
            System.out.println("no match");
        }



    }

}
