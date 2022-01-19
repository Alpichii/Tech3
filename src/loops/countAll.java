package loops;

public class countAll {
    public static void main(String[] args) {
        /*
        Count how many vowels and consonants there in below sentence
        : 9
        Letters: 18
        Uppercase: 5
        Lowercase: 13
        Vowels: 7
        Consonants: 11
        Spaces: 5
        Special characters: 2
         */

        /*
        TASK-1
        Count spaces
        variable name is = spaceCounter
        Expected output:
        Spaces: 5
         */

        String address = "1234 Abc Street, Chicago, IL 12345";

        System.out.println("\n------------Counting-Spaces-------------\n");
        int spaceCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isWhitespace(address.charAt(i))) spaceCounter++;
        }

        System.out.println("Spaces: " + spaceCounter);

        System.out.println("\n------------Counting-Digits-------------\n");
        int digitCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isDigit(address.charAt(i))) digitCounter++;
        }
        System.out.println("Digits: " + digitCounter);


        System.out.println("\n------------Counting-Letters-------------\n");
        int letterCounter = 0;

        for (int i = 0; i <= address.length()-1; i++) {
            if(Character.isLetter(address.charAt(i))) letterCounter++;
        }

        System.out.println("Letters: "+ letterCounter);

        System.out.println("\n------------Counting-Uppercase-Lowercase-Letters-------------\n");
        int uppercaseCounter = 0;
        int lowercaseCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)) uppercaseCounter++;
                else lowercaseCounter++;
            }
        }

        System.out.println("Lowercase: " + lowercaseCounter);
        System.out.println("Uppercase: " + uppercaseCounter);


        System.out.println("\n------------Counting-Special-Characters-------------\n");
        int specialCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(!(Character.isLetterOrDigit(c) || Character.isWhitespace(c))) specialCounter++;
        }

        System.out.println("Special characters: " + specialCounter);


        System.out.println("\n------------Counting-Vowels-Consonants-------------\n");
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i <= address.length()-1; i++) {
            char c = address.toLowerCase().charAt(i);
            if(Character.isLetter(c)){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') countVowels++;
                else countConsonants++;
            }
        }

        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);



        System.out.println("\n------------Putting-All-Together-with-one-fori-loop-------------\n");

        int letters = 0;
        int lowercase = 0;
        int uppercase = 0;
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specials = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isLetter(c)){
                letters++;

                if(Character.isUpperCase(c)) uppercase++;
                else lowercase++;

                c = String.valueOf(c).toLowerCase().charAt(0);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
                else consonants++;
            }
            else if(Character.isDigit(c)) digits++;
            else if(c == ' ') spaces++;
            else specials++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Uppercase Letters: " + uppercase);
        System.out.println("Lowercase Letters: " + lowercase);
        System.out.println("Vowel Letters: " + vowels);
        System.out.println("Consonant Letters: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Specials: " + specials);

    }
}