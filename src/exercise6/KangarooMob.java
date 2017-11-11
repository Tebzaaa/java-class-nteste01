package exercise6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class KangarooMob
 * @author Teboho Samuel Nteso
 */
public class KangarooMob {
    private HashMap<Integer, Kangaroo> kangarooMap;
    private String type;
    private int count;
    private int chief;
    
    public KangarooMob(String fileName){
        Scanner reader = null;
        kangarooMap = new HashMap<Integer, Kangaroo>();
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
        if (fields[2]== "Kangaroo"){
            Kangaroo kangaroo = new Kangaroo(name,age);
            kangarooMap.put(age,kangaroo);
            count++;
        }
    }
    reader.close();
}
    public Kangaroo getKangaroo(int age){
        return kangarooMap.get(age);
     
    }
    public int size(){
        return count;
    }
    public int getChief(){
        return chief;
    }
    public static void main(String [] args){
        KangarooMob mob = new KangarooMob("zoo.txt");
    }
}
