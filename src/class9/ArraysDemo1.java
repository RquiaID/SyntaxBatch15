package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {
        String [] names={"Rquia","Arinas","Ahmed","Khadija","Malek","Jamila"}; // each name is given a number and
        // write a loop to print all the names from array
        System.out.println(names.length);
        for (int i = 0; i <names.length ; i++) {

            System.out.println(names[i]);
        }
    }
}