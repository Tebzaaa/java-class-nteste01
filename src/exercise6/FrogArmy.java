package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class FrogArmy
 * @author Teboho Samuel Nteso
 */
public class FrogArmy {
    private HashMap<Integer, Frog> frogMap;
    private String type;
    private int count;
    private int chief;
    
    public FrogArmy(String fileName){
        Scanner reader = null;
        frogMap = new HashMap<Integer, Frog>();
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
        if (fields[2]== "Frog"){
            Frog frog = new Frog(name,age);
            frogMap.put(age,frog);
            count++;
        }
    }
    reader.close();
}
    public Frog getFrog(int age){
        return frogMap.get(age);
    }
    public int size(){
        return count;
    }
    public int getChief(){
        return chief;
    }
    public static void main(String [] args){
        FrogArmy army = new FrogArmy("zoo.txt");
    }
}
