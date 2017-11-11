package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.File;
import static java.lang.Math.hypot;


/**
 * Class CrowMurder
 * @author Teboho Samuel Nteso
 */
public class CrowMurder {
    private HashMap<Integer, Crow> crowMap;
    private String type;
    private int count;
    private int chief;
    
    public CrowMurder(String fileName){
        Scanner reader = null;
        crowMap = new HashMap<Integer, Crow>();
    try{
        reader = new Scanner(new File (fileName));
    } catch (FileNotFoundException ex){
        System.out.println("Error: could not print file"+fileName+"");
        System.exit(0);
    }
    while (reader.hasNextLine()){
        String[] fields = reader.nextLine().split(",");
        Integer age= Integer.parseInt(fields[1]);
        String name = fields[0];
        String type = fields[2];
        if (fields[2]== "Crow"){
            Crow crow = new Crow(name,age);
            crowMap.put(age,crow);
            count++;
        }
    }
    reader.close();
        chief = Math.max(count, count);
}
    public Crow getCrow(int age){
        return crowMap.get(age);
    }
    public int size(){
        return count;
    }
    public int getChief(){
        return chief;
    }
    public static void main(String [] args){
        CrowMurder murder = new CrowMurder("zoo.txt");
    }
}
