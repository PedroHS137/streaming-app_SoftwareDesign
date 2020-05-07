package mx.iteso.ut;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import java.util.Scanner;

public class category {
    public String catlv1 = "";
    public String catlv2 = "";
    public String catlv3 = "";
    public int pos;

    public String getCategorylv1() {
        category cat = new category();
        String vOutput = cat.ReadCellData(pos, 1);
        //System.out.println(vOutput);1
       return vOutput;
    }
    public String getCategorylv2() {
        category cat = new category();
        String vOutput = cat.ReadCellData(pos, 2);
        //System.out.println(vOutput);
        return vOutput;

    }
    public String getCategorylv3() {
        category cat = new category();
        String vOutput = cat.ReadCellData(pos, 3);
        //System.out.println(vOutput);
        return vOutput;
    }
    public String ReadCellData(int vRow, int vColumn)
    {
        String value = null;          //variable for storing the cell value
        Workbook wb = null;           //initialize Workbook null
        try
        {

            FileInputStream fis = new FileInputStream("C:\\Users\\pjher\\OneDrive\\Documentos\\8 Semestre\\Diseño de software\\tv shows.xlsx");
            wb = new XSSFWorkbook(fis);

        }

        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        Sheet sheet=wb.getSheetAt(0);
        Row row=sheet.getRow(vRow);
        Cell cell=row.getCell(vColumn);
        value=cell.getStringCellValue();
        return value;
    }
    public String getRndShow() {
        category cat = new category();
        pos = cat.getRndShowPos();
        System.out.println("position: " + pos);
        String vOutput = cat.ReadCellData(pos, 0);
        return vOutput;
    }
    public int getRndShowPos() {
        category cat = new category();
        Random rand = new Random();
        int rand_int1 = rand.nextInt(202);
        // String vOutput = cat.ReadCellData(rand_int1, 0);
        return rand_int1;
    }

    public static void main (String[]args){
        // category cat = new category();
        // String str = cat.getRndShow();
        // String str1 = cat.getCategorylv1();
        // String str2 = cat.getCategorylv2();
        // String str3 = cat.getCategorylv3();
        // System.out.println("nombre del programa: " + str + " , categoriaLv1: " + str1 +
        //        " , categoriaLv2: " + str2 + " , categoriaLv3: " + str3);
        Scanner in = new Scanner(System.in);
        game game = new game();
        System.out.println("ingresa el nivel de dificultad(1,2 o 3) ");
        int a = in.nextInt();
        //System.out.println( a );
        System.out.println(" ingresa la cantidad de horas disponibles(100,200 o 300) ");
        int b = in.nextInt();
        if(a == 1){
            game.level1(b);
        }
        if(a == 2){
            game.level2(b);
        }
        if(a == 3){
            game.level3(b);
        }
    }
}
