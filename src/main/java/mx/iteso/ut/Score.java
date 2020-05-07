package mx.iteso.ut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Score {
    /**
     *
     * @param array,showsVistos
     * @return score
     */
    public float getTotalScore(ArrayList <String> array, int showsVistos){
        int score = 0;
        boolean hasSeenCrap = false;
        for( String str : array ){
            if (str.equals("violento") || str.equals("sexual") || str.equals("talk shows") ||
                    str.equals("informerciales") || str.equals("cine de ficheras") || str.equals("telenovelas")
            || str.equals("inculto") || str.equals("inadecuado") || str.equals("morning shows")) {
                score = score-50;
                hasSeenCrap = true;
            } else {
                score+=100;
            }
        }
        if(hasSeenCrap) {
            score*=1.2;
        }
        Map<String, Integer> counts = new HashMap<String, Integer>();

        for (String str : array) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }

        // for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            // System.out.println(entry.getKey() + " = " + entry.getValue());
        // }
        return score;
    }
}
