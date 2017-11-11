package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author Teboho Samuel Nteso
 */
public class Crow {
    private String name;
    private int age;
    private final int iq = 100;
    
    public Crow(String name, int age){
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + this.age;
        hash = 31 * hash + this.iq;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crow other = (Crow) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.iq != other.iq) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crow{" + "name=" + name + ", age=" + age + ", iq=" + iq + '}';
    }
    
}
