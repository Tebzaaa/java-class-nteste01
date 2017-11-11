package exercise6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class OwlParliament
 * @author Teboho Samuel Nteso
 */
public class OwlParliament {
    private HashMap<Integer, Owl> owlMap;
    private String type;
    private int count;
    private int chief;
    
    public OwlParliament(String fileName){
        Scanner reader = null;
        owlMap = new HashMap<Integer, Owl>();
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
        if (fields[2]== "Owl"){
            Owl owl = new Owl(name,age);
            owlMap.put(age,owl);
            count++;
        }
    }
    reader.close();
}
    public Owl getOwl(int age){
        return owlMap.get(age);
    }
    public int size(){
        return count;
    }
    public int getChief(){
        return chief;
    }
    public static void main(String [] args){
        OwlParliament parliament = new OwlParliament("zoo.txt");
    }
}