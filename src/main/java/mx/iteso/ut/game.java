package mx.iteso.ut;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * class.
 */
public class game {
    /**
     * var.
     */
    private category cat = new category();
    /**
     * var.
     */
    private String str = cat.getRndShow();
    /**
     * var.
     */
    private Score sc = new Score();
    /**
     * var.
     */
    private ArrayList<String> visto = new ArrayList<>();
    /**
     * var.
     */
    private ArrayList<String> vistoCat = new ArrayList<>();
    /**
     * var.
     */
    private int a = cat.getRndShowPos();

    /**
     *
     * @param time
     * @return float
     */
    public float level1(final int time) {
        int currTime = 0;
        category cat = new category();
        Scanner in = new Scanner(System.in);
        int cantidadVistaDeBasura = 0;
        int showsVistos = 0;

        while (currTime < time) {
            String str = cat.getRndShow();
            String str1 = cat.getCategorylv1();
            System.out.println("nombre: " + str + " ,categoria: " + str1);
            System.out.println("ver show de tv? 1:si , 0:no ");
            int a = in.nextInt();
            if (a == 1 && !(str1.equals("inadecuado"))) {
                currTime += 10;
                visto.add(str + " , " + str1);
                vistoCat.add(str1);
            }
            if (a == 1 && str1.equals("inadecuado")) {
                currTime += 20;
                cantidadVistaDeBasura++;
                visto.add(str + " , " + str1);
                vistoCat.add(str1);
            }
            showsVistos++;
        }
        System.out.println("viste: " + showsVistos + " shows, y "
                + cantidadVistaDeBasura + " shows basura ");
        System.out.println();
        System.out.println("Shows vistos");
        System.out.println("-------------------");
        for (String strShow : visto) {
            System.out.println(strShow);
        }
        System.out.println();
        System.out.println("PUNTAJE: "
                + sc.getTotalScore(vistoCat, showsVistos));
        return sc.getTotalScore(vistoCat, showsVistos);

    }
    /**
     *
     * @param time
     * @return float
     */
    public float level2(final int time) {
        int currTime = 0;
        int cantidadVistaDeBasura = 0;
        category cat = new category();
        Scanner in = new Scanner(System.in);
        int showsVistos = 0;

        while (currTime < time) {
            String str = cat.getRndShow();
            String str1 = cat.getCategorylv2();
            System.out.println("nombre: " + str + " ,categoria: "
                    + str1);
            System.out.println("ver show de tv? 1:si , 0:no ");
            int a = in.nextInt();
            if (a == 1) {
                currTime += 10;
                visto.add(str + " , " + str1);
                vistoCat.add(str1);
            }
            if (a == 1 && str1.equals("violento") || str1.equals("sexual")
                    || str1.equals("inculto")) {
                currTime += 20;
                cantidadVistaDeBasura++;
                visto.add(str + " , " + str1);
                vistoCat.add(str1);
            }
            showsVistos++;
        }
        System.out.println("viste: " + showsVistos + " shows, y "
                + cantidadVistaDeBasura + " shows basura ");
        System.out.println();
        System.out.println("Shows vistos");
        System.out.println("-------------------");
        for (String strShow : visto) {
            System.out.println(strShow);
        }
        System.out.println();
        System.out.println("PUNTAJE: "
                + sc.getTotalScore(vistoCat, showsVistos));
        return sc.getTotalScore(vistoCat, showsVistos);
    }
    /**
     *
     * @param time
     * @return float
     */
    public float level3(final int time) {
        int currTime = 0;
        category cat = new category();
        Scanner in = new Scanner(System.in);
        int cantidadVistaDeBasura = 0;
        int showsVistos = 0;

        while (currTime < time) {
            String str = cat.getRndShow();
            String str1 = cat.getCategorylv3();
            System.out.println("nombre: " + str + " ,categoria: "
                    + str1);
            System.out.println("ver show de tv? 1:si , 0:no ");
            int a = in.nextInt();
            if (a == 1) {
                currTime += 10;
                visto.add(str + " , " + str1);
                vistoCat.add(str1);
            }
            if (a == 1 && str1.equals("violento")
                    || str1.equals("sexual")
                    || str1.equals("talk shows")
                    || str1.equals("informerciales")
                    || str1.equals("cine de ficheras")
                    || str1.equals("telenovelas")
                    || str1.equals("morning shows")) {
                currTime += 20;
                cantidadVistaDeBasura++;
                visto.add(str + " , " + str1);
                vistoCat.add(str1);
            }
            showsVistos++;
        }
        System.out.println("viste: " + showsVistos + " shows, y "
                + cantidadVistaDeBasura + " shows basura ");
        System.out.println();
        System.out.println("Shows vistos");
        System.out.println("-------------------");
        for (String strShow : visto) {
            System.out.println(strShow);
        }
        System.out.println();
        System.out.println("PUNTAJE: "
                + sc.getTotalScore(vistoCat, showsVistos));
        return sc.getTotalScore(vistoCat, showsVistos);
    }


}
