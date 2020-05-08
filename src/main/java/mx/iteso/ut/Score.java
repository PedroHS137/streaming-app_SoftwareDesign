package mx.iteso.ut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Score {
    /**
     * var.
     */
    private final float bonus = 1.2f;
    /**
     * var.
     */
    private final int penalisation = 50;
    /**
     * var.
     */
    private final int correctChoice = 100;
    /**
     *
     * @param array
     * @param showsVistos
     * @return score
     */
    public float getTotalScore(final ArrayList<String> array,
                                final int showsVistos) {
        int score = 0;
        boolean hasSeenCrap = false;
        for (String str : array) {
            if (str.equals("violento") || str.equals("sexual")
                    || str.equals("talk shows")
                    || str.equals("informerciales")
                    || str.equals("cine de ficheras")
                    || str.equals("telenovelas") || str.equals("inculto")
                    || str.equals("inadecuado")
                    || str.equals("morning shows")) {
                score = score - penalisation;
                hasSeenCrap = true;
            } else {
                score += correctChoice;
            }
        }
        if (hasSeenCrap) {
            score *= bonus;
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
