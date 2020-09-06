package com.tectro;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int CheckAndFlush(Scanner in)
    {
        if(in.hasNextInt())
            return in.nextInt();
        else {
            in.next();
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
	    exercises ex = new exercises();
	    Scanner in = new Scanner(System.in);

        int result = 0;
	    do {
            System.out.println("1) Задание 1");
            System.out.println("2) Задание 2");
            System.out.println("3) Задание 3");
            System.out.println("4) Задание 4");
            System.out.println("0) Выход");
            System.out.println();

            result = CheckAndFlush(in);

            switch (result) {
                case 1:ex.exs1(in); break;
                case 2:ex.exs2(in); break;
                case 3:ex.exs3(in); break;
                case 4:ex.exs4(in); break;
            }

            char c = (char) System.in.read();
	    }
	    while (result!=0);
    }
}
