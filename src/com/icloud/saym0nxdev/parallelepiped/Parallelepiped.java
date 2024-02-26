package com.icloud.saym0nxdev.parallelepiped;

public class Parallelepiped {
    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;
        double height = 2.0;

        double volume = length * width * height;

        System.out.println("Volume = " + volume);

        double totalLength = 4 * (length + width + height);

        System.out.println("Total length of all sides = " + totalLength);
    }
}