package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
     /*   int mat1[] ={1,2,3,4,5,6,7,8,9};
            int sum = 0;

        for (int i =0; i < mat1.length; i++){
            sum += mat1[i];
        }
        System.out.println(sum);
        SUM ALL ARRAY IN VALUES
        */


        /*int mat1[] ={1,2,3,4,5,6,7,8,9};
        int sum = 0;
        double rata2 = 0;
        for (int i =0; i < mat1.length; i++){
            sum += mat1[i];
            rata2 = sum / mat1.length;
        }
        System.out.println(rata2);*/
        /// average
        int baris;
        int kolom;

       int matA[][] = {{6,3,2},
                        {4,2,3}};

        int matb [][]= {{1,2},
                        {2,3},
                        {3,1}};
        baris = matA.length;
        kolom = matb[0].length;

        int matC [] [] = new int[baris][kolom];



        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                for (int k = 0; k < matb.length; k++) {
                    matC[i][j] += matA[i][k] * matb[k][j];
                    //hasil matC berordo 2x2 karena matA memiliki baris 2 dan matb memiliki kolom 2.
                    //kenapa matA[i][k] karena matA membutuhkan 2 baris dan 3 kolom oleh karena itu mengambil 2 baris dari matA.length dan mengambil 3 kolom dari matb.length
                    //kenapa matb[k][j] karena matb membutukan 3 baris dan 2 kolom oleh karena itu mengambil 3 baris matb.length dan mengambil 2 kolom dari matb[0].length
                    
                }
                System.out.print(matC[i][j] + " ");
            }
            System.out.println(" ");

        }
    }}
