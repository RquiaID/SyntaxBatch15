package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jdnfkfd 34982349989898 ^8%*"; // we can use enhanced for loop
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {

            if(Character.isAlphabetic(str.charAt(i))){

                /// to find out how many numbers we use isDigit

                counter++;

            }

        }
        System.out.println("Total isAlphabetic in Str " +counter);


    }
}
