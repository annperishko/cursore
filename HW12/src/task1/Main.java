package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print num mark");
        int mark = sc.nextInt();

        Mark numMark = new Mark(mark);
        numMark.displayTextMark();


    }
}
