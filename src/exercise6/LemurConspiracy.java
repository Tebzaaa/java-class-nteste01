package exercise6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class LemurConspiracy
 * @author Teboho Samuel Nteso
 */
public class LemurConspiracy {
    private HashMap<Integer, Lemur> lemurMap;
    private String type;
    private int count;
    private int chief;
    
    public LemurConspiracy(String fileName){
        Scanner reader = null;
        lemurMap = new HashMap<Integer, Lemur>();
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
        if (fields[2]== "Lemur"){
            Lemur lemur = new Lemur(name,age);
            lemurMap.put(age,lemur);
            count++;
        }
    }
    reader.close();
}
    public Lemur getLemur(int age){
        return lemurMap.get(age);
    }
    public static void main(String [] args){
        LemurConspiracy conspiracy = new LemurConspiracy("zoo.txt");
    }
    public int size(){
        return count;
    }
    public int getChief(){
        return chief;
    }
}