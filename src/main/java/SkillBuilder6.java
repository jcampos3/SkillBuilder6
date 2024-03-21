
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants
    private static boolean lookingfort;
    private static boolean lookingfory;


    public static String findTYPattern(String s)
    {
        String words = "";
        lookingfort = true;
        lookingfory = false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 't' || s.charAt(i) == 'T'){
                lookingfort = false;
                lookingfory = true;
            }
            if(lookingfort == false && lookingfory == true){
                words += s.charAt(i);
            }

            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                lookingfory = false;
            }
        }
        if(lookingfort == false && lookingfory == true){
            return "";
        }
        // replace this line with your code
        return words;
    }
}
