package com.tectro;

import java.util.Random;
import java.util.Scanner;

public class exercises
{
    public void exs1(Scanner in){

        int counter = 0;
        double x=0, y=0;

        //=============================================
        //чтение данных
            System.out.println("Введите X и Y");

            x = in.nextDouble();
            y = in.nextDouble();

        //=============================================
        //Вариант 23

        double result =
                Math.pow(3.0, x) - 4.0 * x + (y - Math.sqrt(Math.abs(x)));

        System.out.printf("Реезультат вычисления формулы: %.5f \n",result);
    }

    public void exs2(Scanner in) {
        System.out.print("Введите целое число");
        int value = in.nextInt();
        String rawValue = String.valueOf(value);
        int counter = 0;
        int first = 1;
        int second = 1;
        for (char c : rawValue.toCharArray())
        {
            if (counter % 2 == 0)
                first*=Integer.parseInt(String.valueOf(c));
            else
                second*=Integer.parseInt(String.valueOf(c));

            counter++;
        }
        System.out.printf("Реезультат частного произведений четных и нечетных цифр  числа: %.5f \n",second/(float)first);
    }

    public void exs3(Scanner in)
    {
        System.out.println("Введите три натуральные числа");

        int
                first = in.nextInt(),
                second = in.nextInt(),
                third = in.nextInt();

        System.out.printf("Среднее арифметическое трех натуральных чисел: %.5f \n",(third+second+first)/3.0);
    }


    public void exs4(Scanner in){
        System.out.println("Введите некую цифру k");
        byte k = in.nextByte();
        int randValue = new Random().nextInt(100);
        System.out.println("Дописанное число k в конец и в начало к случайному числу "+ randValue+" \n"+k+randValue+k);

    }

}
