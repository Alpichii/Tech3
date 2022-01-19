package methodUtility;

import java.util.Random;

public class RandomNumberGenerator {

    public static int getRandomNumber(int start, int end){
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }
}

