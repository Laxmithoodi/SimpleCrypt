import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {


    public ROT13() {
    }

//    public ROT13(char a, char n) {
//
//    }

    public String encrypt(String str) {
//regex for space to handle

        String result = "";
        char[] chArr = str.toLowerCase().toCharArray();
        for (char ch : chArr) {
            if(ch==' ' || ch == '?' || ch == '!') {

                result += ch;
//            else if(ch=='?')
//                result+='?';
//            else if(ch=='!')
//                result+='!';

            }  else
                result+= getChar(ch).charValue();
        }
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }



    public String decrypt(String str) {

//        String result = "";
//
//        result = encrypt(str);

        return encrypt(str);
    }




    public Character getChar(Character ch) {

        Map<Character, Character> map = new HashMap<>();

        for (int i = 97; i <= 122; i++) {
            if (i < 110) {

                map.put((char)i, (char) (i+13));
            } else
                map.put((char) i, (char) (i - 13));

        }

        return map.get(ch);


    }

    public String rotate(String s, Character c) {
        if((s.charAt(0) =='A') && (c == 'A'))
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i =(s.length()/2); i<s.length();i++){
            sb.append(s.charAt(i));
        }
        for(int j=0; j<s.length()/2; j++){
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }




    public String crypt(String st1) {



        return encrypt(st1) ;
    }

}
