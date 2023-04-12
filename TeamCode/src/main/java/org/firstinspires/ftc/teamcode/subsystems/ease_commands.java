package org.firstinspires.ftc.teamcode.subsystems;

import static java.lang.Math.*;

public class ease_commands {
    // literally just anything to make life easier
    // if imported static you can just use it in your code
    // just call import static org.firstinspires.ftc.teamcode.subsystems.ease_commands.*;

    public static double sumAll(double[] i) {
        double o = 0;
        for ( double x : i) {
            o+=x;
        }
        return o;
    }
    public static int sumAll(int[] i) {
        int o = 0;
        for ( double x : i) {
            o+=x;
        }
        return o;
    }
    public static int minAll(int[] input) {
        int o = 0;
        int i = 0;
        for (double x : input) {
            o = min(input[i], input[i+1]);
            if ((i+1) == input.length) {
                break;
            }
            i++;
        }
        return o;
    }
    public static double minAll(double[] input) {
        double o = 0;
        int i = 0;
        for (double x : input) {
            o = min(input[i], input[i+1]);
            if ((i+1) == input.length) {
                break;
            }
            i++;
        }
        return o;
    }
    public static int maxAll(int[] input) {
        int o = 0;
        int i = 0;
        for (double x : input) {
            o = max(input[i], input[i+1]);
            if ((i+1) == input.length) {
                break;
            }
            i++;
        }
        return o;
    }
    public static double maxAll(double[] input) {
        double o = 0;
        int i = 0;
        for (double x : input) {
            o = max(input[i], input[i+1]);
            if ((i+1) == input.length) {
                break;
            }
            i++;
        }
        return o;
    }

    public static String colorID(int[] i) {
        // make colors with matching indices to their values
//        String[] colors = {"black","very_light_red","light_red","red","dark_red","very_dark_red",
//                "very_light_blue", "light_blue","blue","dark_blue","very_dark_blue","very_light_green",
//                "light_green","green","dark_green","very_dark_green","white"};
//        int[][] color_values = {{0,0,0},{255,102,102},{255,51,51},{255,0,0},{204,0,0},
//                {153,0,0},{51,204,255},{51,153,255},{0,0,255},{0,0,204},{0,0,153},{102,255,102},
//                {0,255,51},{0,204,0},{0,153,0},{0,102,0},{255,255,255}};
        String[] colors = {"violet","indigo","blue","green","yellow","orange","red"};
        int[][] color_values = {{148, 0, 211},{75, 0, 130},{0, 0, 255},{0, 255, 0},{255, 255, 0},{255, 127, 0},{255, 0 , 0}};

        // new array to store total difference of r, g, and b values to our known colors
        int[] similarity = new int[colors.length];

        // loop through color values
        int iterator = 0;
        for (int[] arrdata : color_values) {
            int temp,iter;
            temp=iter=0;
            // loop through each piece of data
            for (int data : arrdata) {
                // compare our data to color_values and save the total difference of all r, g, and b
                temp+=abs(data - i[iter]);
                iter++;
            }
            // assign the total difference to the matching index
            similarity[iterator] = temp;
            iterator++;
        }

        // find the number that has the smallest difference of our color to test colors
        int flag = minAll(similarity);

        // search for the smallest differance as determined in flag
        iterator = 0;
        for (int x : similarity) {
            if (x == flag) {
                break;
            }
            iterator++;
        }
        // return the name of the color equal to the index of the lowest color difference
        return colors[iterator];
    }
}
