package mx.iteso.ut;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

/**
 * class.
 */
public class category {
    private int pos;

    /**
     *
     * @param
     * @return vOutput
     */
    public String getCategorylv1() {
        category cat = new category();
        String vOutput = cat.readCellData(pos, 1);
        //System.out.println(vOutput);1
       return vOutput;
    }
    /**
     *
     * @param
     * @return vOutput
     */
    public String getCategorylv2() {
        category cat = new category();
        String vOutput = cat.readCellData(pos, 2);
        //System.out.println(vOutput);
        return vOutput;

    }
    /**
     *
     * @param
     * @return vOutput
     */
    public String getCategorylv3() {
        category cat = new category();
        String vOutput = cat.readCellData(pos, 3);
        //System.out.println(vOutput);
        return vOutput;
    }
    /**
     *
     * @param vRow
     * @param vColumn
     * @return value
     */
    public String readCellData(final int vRow, final int vColumn) {
        String value = null;          //variable for storing the cell value
        Workbook wb = null;           //initialize Workbook null
        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\pjher\\"
                    + "OneDrive\\Documentos\\8 Semestre\\"
                    + "Diseño de software\\tv shows.xlsx");
            wb = new XSSFWorkbook(fis);

        }

        catch(IOException e1) {
            e1.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        value = cell.getStringCellValue();
        return value;
    }
    /**
     *
     * @param
     * @return vOutput
     */
    public String getRndShow() {
        category cat = new category();
        pos = cat.getRndShowPos();
        System.out.println("position: " + pos);
        String vOutput = cat.readCellData(pos, 0);
        return vOutput;
    }
    /**
     *
     * @param
     * @return randInt1
     */
    public int getRndShowPos() {
        category cat = new category();
        Random rand = new Random();
        int randInt1 = rand.nextInt(202);
        return randInt1;
    }
    /**
     *
     * @param args
     * @return
     */
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        game game = new game();
        System.out.println(" "
                + "ingresa el nivel de dificultad(1,2 o 3) ");
        int a = in.nextInt();
        System.out.println(" "
                + "ingresa la cantidad de horas disponibles(100,200 o 300) ");
        int b = in.nextInt();
        if (a == 1) {
            game.level1(b);
        }
        if (a == 2) {
            game.level2(b);
        }
        if (a == 3) {
            game.level3(b);
        }
    }
}
