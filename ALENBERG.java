/*
 * Methods created by ALENBERG
 */
package ALENBERG_Utilities;

/**
 *
 * @author ALENBERG
 */
public class ALENBERG {

    /**
     * Rot Encryption
     *
     * @param toEncrypt
     * @param rot_num
     * @return
     */
    static String rot_encryption(String toEncrypt, int rot_num) {
        //declarations
        String newstring = "";
        char[] str = new char[toEncrypt.length()];

        if (rot_num > 25) {                              //if int give is grater than 25 it take the reminder
            rot_num = rot_num % 25;
        }

        for (int i = 0; i < toEncrypt.length(); i++) {                              //transform the String give to char array
            str[i] = toEncrypt.charAt(i);
        }

        for (int i = 0; i < str.length; i++) {                              //analize each character of the char array
            if ((str[i] >= 65 && str[i] <= 90 && ((str[i] + rot_num) > 90)) || (str[i] >= 97 && str[i] <= 122 && (str[i] + rot_num) > 122)) {
                newstring += (char) (str[i] - 26 + rot_num);
            }
            //if the character is between 65 and 90 (and grater than 90 with added number)or
            //between 97 and 122 (and grater than 122 with added number) the program subract 26 and add the given number
            if ((str[i] >= 65 && str[i] + rot_num <= 90) || (str[i] >= 97 && str[i] + rot_num <= 122)) {
                newstring += (char) (str[i] + rot_num);
            }
            //if the character is between 65 and 90 (with added number) or 
            //between 97 and 122 (with added number) the program add the char to string newstring 
            if ((str[i] >= 0 && str[i] <= 64) || (str[i] >= 91 && str[i] <= 96) || str[i] >= 123) {
                newstring += (char) str[i];
            }
            //if the character is a special character remains invariated
        }
        return newstring;
    }

    /**
     * Rot Decryption
     *
     * @param toDecrypt
     * @param rot_num
     * @return
     */
    static String rot_decryption(String toDecrypt, int rot_num) {
        //declarations
        String newstring = "";
        char[] str = new char[toDecrypt.length()];

        if (rot_num > 25) {                              //if int give is grater than 25 it take the reminder
            rot_num = rot_num % 25;
        }

        for (int i = 0; i < toDecrypt.length(); i++) {                              //transform the String give to char array
            str[i] = toDecrypt.charAt(i);
        }

        for (int i = 0; i < str.length; i++) {                              //analize each character of the char array
            if ((str[i] >= 65 && str[i] <= 90 && ((str[i] - rot_num) < 65)) || (str[i] >= 97 && str[i] <= 122 && (str[i] - rot_num) < 97)) {
                newstring += (char) (str[i] + 26 - rot_num);
            }
            //if the character is between 65 and 90 (and lesser than 90 with subtracted number)or
            //between 97 and 122 (and lesser than 122 with subtracted number) the program add 26 and subtract the given number
            if ((str[i] <= 90 && str[i] - rot_num >= 65) || (str[i] <= 122 && str[i] - rot_num >= 97)) {
                newstring += (char) (str[i] - rot_num);
            }
            //if the character is between 65 (with subtracted number) and 90 or 
            //between 97 (with subtracted number) and 122 the program subtract the given number
            if ((str[i] >= 0 && str[i] <= 64) || (str[i] >= 91 && str[i] <= 96) || str[i] >= 123) {
                newstring += (char) str[i];
            }
            //if the character is a special character remains invariated
        }
        return newstring;
    }

    static String stringToBinary(String toBinary){
        String newstring = "";
        //add string conversion
        return newstring;
    }
    //TODO:
    //String to binary
    //String to hex
    //File encryption 
    //File decryption
}
