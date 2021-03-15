package Tugas2PL;

public class Main {

    public static void main(String[] args) {
        int y = 0;
        int x = 20;

        // error handling 1
        try {
            int a = x / y;
            System.out.println("baris ini tidak akan di run");
        } catch (ArithmeticException e) {
            System.out.println("di blok catch adalah untuk menangkap error = " + e);
        }

        // error handling 2
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // didalam array tidak ada angka 10
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("di blok catch adalah untuk menangkap error = " + e);
        }


        // error handling 3
        String s = "abcd";

        foo(null);



        // error handling 4
        try{
            String input = "null";
            int Angka = 0;
             Angka = Integer.parseInt(input);
            System.out.println("konversi ke Integer adalah " + Angka);

        }catch (NumberFormatException e){
            System.out.println("di blok catch adalah untuk menangkap error = " + e);
        }


        // error handling 5
        try{
            Object i = Integer.valueOf(100);
            String k = (String)i;

        }catch (ClassCastException e){
            System.out.println("di blok catch adalah untuk menangkap error = " + e);
        }

        System.out.println("End Of Main");
    }

    // ini method error handling 3
    static void foo(String x){
        try {
            System.out.println("karakter pertama : " + x.charAt(0));
        }
        catch(NullPointerException e) {
            System.out.println("di blok catch adalah untuk menangkap error = " + e);
        }
    }


}

