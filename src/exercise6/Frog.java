package exercise6;

import java.util.Objects;

/**
 * Class Frog
 * @author Teboho Samuel Nteso
 */
public class Frog {
    private String name;
    private int age;
    private String color;

    public Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Frog(String color){
        this.color = "Green";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.color);
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
        final Frog other = (Frog) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Frog{" + "name=" + name + ", age=" + age + ", color=" + color + '}';
    }
    
    
}
