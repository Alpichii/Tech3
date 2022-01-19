package methodUtility;

public class CharChecker {
    public static boolean isSpecialCharacter(char ch){
        return !Character.isLetterOrDigit(ch) && !Character.isSpaceChar(ch);
    }
}
