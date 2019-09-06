package cn.xtrui.mbp.sort;

import net.sf.jsqlparser.statement.create.table.Index;

public class Maopao {
    public static void main(String[] args) {
        int[] array = {5,6,3,8,1};
        select(array);

    }

    public static int[]  maopao(@org.jetbrains.annotations.NotNull int[] array){
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < array.length-1; i++){
            if (flag){ break;}
            flag = true;
            count++;
            for (int j = 0; j < array.length -1- i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }

        }
        for (int a: array) {
            System.out.print(a);
        }
        System.out.println(count);
        return array;
    }

    public static int[] select(int[] array){
        int min;
        int index=0;
        min = array[0];
        for (int i = 0; i < array.length; i++){
            min = array[i];
            index = i;
            for (int j = i+1; j<array.length;j++){
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;

        }

        for (int a: array) {
            System.out.print(a);
        }
        return array;
    }
}
