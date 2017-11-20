import static java.lang.Math.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class main {
    public static void main(String[] args)throws FileNotFoundException{

        float a=0;
        float licznik=0;
        int b=0;
        float avg;
        String zmienna;
        File file = new File("C:\\Users\\cp24\\IdeaProjects\\one\\plik.txt");
        PrintWriter save = new PrintWriter("wynik.txt");

        Scanner read = new Scanner(file);

        while(read.hasNextFloat())
        {
            a=read.nextFloat();
            licznik+=a;
            b++;
            System.out.print(a+"\n");
        }

        avg=licznik/b;

        save.printf("Srednia to = %.2f",avg);
        save.close();

    }
}


