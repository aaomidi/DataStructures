package com.aaomidi.datastructures.lessons.l01;

import com.aaomidi.datastructures.utils.Strings;
import lombok.Getter;

import java.util.Scanner;

public class Array implements IArray {
    @Getter
    private int[] list;
    @Getter
    private int n;

    /**
     * Constructs the Array.
     *
     * @param m
     */
    @SuppressWarnings("unchecked")
    public Array(int m) {
        this.list = new int[m];
        this.n = m;
    }

    /**
     * Tests this class.
     */
    public static void test() {
        Scanner scanner = new Scanner(System.in);
        Strings.log("Please enter the size of the array: ");
        int size = scanner.nextInt();
        Array a = new Array(size);
        for (int i = 0; i < size; i++) {
            Strings.log("Please enter the %d element: ", i + 1);
            int element = scanner.nextInt();
            a.getList()[i] = element;
        }
        Strings.logn(a.toString());

    }


    @Override
    public void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (list[i] < list[j]) {
                    int tmp;
                    tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    @Override
    public int indexOf(int key) {
        for (int i = 0; i < n; i++)
            if (list[i] == key) return i;

        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("----");
        sb.append("\n");
        for (int i = 0; i < n; i++) {
            sb
                    .append(list[i])
                    .append("\n");
        }
        return sb.toString();
    }
}

