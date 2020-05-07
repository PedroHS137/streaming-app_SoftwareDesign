package mx.iteso.ut;
import java.util.ArrayList;
import java.util.Scanner;

public class game {
    category cat = new category();
    String str = cat.getRndShow();
    ArrayList<String> visto = new ArrayList<>();
    int a = cat.getRndShowPos();

    public void level1(int time) {
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
            if(a == 1 && !(str1.equals("inadecuado"))) {
                //System.out.println("a ");
                currTime += 10;
                visto.add(str +" , "+ str1);
            }
            if(a == 1 && str1.equals("inadecuado")) {
                //System.out.println("b ");
                currTime += 20;
                cantidadVistaDeBasura ++;
                visto.add(str +" , "+ str1);
            }
            showsVistos++;
        }
        System.out.println("viste: " + showsVistos + " shows, y " + cantidadVistaDeBasura +
                " shows basura ");

        System.out.println("Shows vistos");
        for( String strShow : visto ){
            System.out.println(strShow);
        }
    }
    public void level2(int time) {
        int currTime = 0;
        int cantidadVistaDeBasura = 0;
        category cat = new category();
        Scanner in = new Scanner(System.in);
        int showsVistos = 0;

        while (currTime < time) {
            String str = cat.getRndShow();
            String str1 = cat.getCategorylv2();
            System.out.println("nombre: " + str + " ,categoria: " + str1);
            System.out.println("ver show de tv? 1:si , 0:no ");
            int a = in.nextInt();
            if(a == 1 && !str1.equals("violento") || !str1.equals("sexual") || !str1.equals("inculto") ) {
                currTime += 10;
                visto.add(str +" , "+ str1);
            }
            if(a == 1 && str1.equals("violento") || str1.equals("sexual") || str1.equals("inculto")) {
                currTime += 20;
                cantidadVistaDeBasura++;
                visto.add(str +" , "+ str1);
            }
            showsVistos++;
        }
        System.out.println("viste: " + showsVistos + " shows, y " + cantidadVistaDeBasura +
                " shows basura " );
        System.out.println("Shows vistos");
        for( String strShow : visto ){
            System.out.println(strShow);
        }
    }

    public void level3(int time) {
        int currTime = 0;
        category cat = new category();
        Scanner in = new Scanner(System.in);
        int cantidadVistaDeBasura = 0;
        int showsVistos = 0;

        while (currTime < time) {
            String str = cat.getRndShow();
            String str1 = cat.getCategorylv3();
            System.out.println("nombre: " + str + " ,categoria: " + str1);
            System.out.println("ver show de tv? 1:si , 0:no ");
            // Talk Shows, Morning Shows, Infomerciales, Cine de Ficheras y Telenovelas
            int a = in.nextInt();
            if (a == 1 && !str1.equals("violento") || !str1.equals("sexual") || !str1.equals("talk shows") ||
                    !str1.equals("informerciales") || !str1.equals("cine de ficheras") || !str1.equals("telenovelas")) {
                currTime += 10;
                visto.add(str +" , "+ str1);
            }
            if (a == 1 && str1.equals("violento") || str1.equals("sexual") || str1.equals("talk shows") ||
                    str1.equals("informerciales") || str1.equals("cine de ficheras") || str1.equals("telenovelas")) {
                currTime += 20;
                cantidadVistaDeBasura++;
                visto.add(str +" , "+ str1);
            }
            showsVistos++;
        }
        System.out.println("viste: " + showsVistos + " shows, y " + cantidadVistaDeBasura +
                " shows basura " );
        System.out.println("Shows vistos");
        for( String strShow : visto ){
            System.out.println(strShow);
        }
    }


}
