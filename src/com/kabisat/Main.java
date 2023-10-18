package com.kabisat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int tahun;
	Scanner input = new Scanner(System.in);

	System.out.print("Masukkan Tahun : ");
    tahun = input.nextInt();
    if(tahun % 400 == 0)
    {
        System.out.println(tahun + " adalah tahun kabisat");
    } else if(tahun % 100 == 0)
    {
        System.out.println(tahun + " bukan tahun kabisat");
    } else if(tahun % 4 == 0)
    {
        System.out.println(tahun + " adalah tahun kabisat");
    } else
    {
            System.out.println(tahun + " bukan tahun kabisat");
    }
    }
}
