package usinglist;

import java.util.HashMap;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        HashMap<String,String>dictionary= new HashMap();
        dictionary.put("Cat","An animal");
        dictionary.put("Pernicious","Having a harmful effect, especially in a gradual or subtle way.");
        dictionary.put("Serendipity","The occurrence of events by chance in a happy or beneficial way.");
        dictionary.put("Ephemeral","Lasting for a very short time; transient.");
        dictionary.put("Ubiquitous","Present, appearing, or found everywhere.");
        dictionary.put("Resilience","The capacity to recover quickly from difficulties; toughness.");
        dictionary.put("Sonder","The realization that each random passerby is living a life as vivid and complex as your own.");
        dictionary.put(" Epiphany","A moment of sudden revelation or insight.");
        dictionary.put(" Melancholy","A feeling of pensive sadness, typically with no obvious cause.");
        dictionary.put("Quintessential","Representing the most perfect or typical example of a quality or class.");
        dictionary.put("Euphoria","A feeling or state of intense excitement and happiness.");
        dictionary.put("Mellifluous","Sweet or musical; pleasant to hear.");
        dictionary.put(" Nostalgia","A sentimental longing or affection for the past.");
        dictionary.put("Surreptitious","Kept secret, especially because it would not be approved of.");
        dictionary.put("Sagacious","  Having or showing keen mental discernment and good judgment; wise.");
        dictionary.put("Serene","Calm, peaceful, and untroubled; tranquil.");
        dictionary.put(" Panacea"," A solution or remedy for all difficulties or diseases.");
        System.out.println(dictionary);
//        System.out.println(dictionary.get("cat"));
        System.out.println("1.List of words\n"+"2.Type in a word for its meaning");
        int options = new Scanner(System.in).nextInt();
        int count = 1;
        for(String word: dictionary.keySet()){
            System.out.println(count+ "." + word);
            count++;
            if(options==1){
                System.out.println();
            }
        }
    }
}
