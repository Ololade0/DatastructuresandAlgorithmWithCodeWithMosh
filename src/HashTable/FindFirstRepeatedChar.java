package HashTable;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {
    public char findFirstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();
        for(var ch : str.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;


    }

}
