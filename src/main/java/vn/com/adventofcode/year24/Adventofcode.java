package vn.com.adventofcode.year24;

import vn.com.adventofcode.common.Day;

import java.lang.reflect.InvocationTargetException;

/**
 * @author : AnhTuPhi
 * @created : 12/1/2024 - 11:23 PM - Sunday
 * @project : adventofcode
 **/

public class Adventofcode {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        loopAllDays();
        executeDay(1);
    }

    public static void loopAllDays() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (var day = 1; day <= 25; day++) {
            System.out.println("Day " + day + ":");
            var instance = (Day) Class.forName("vn.com.adventofcode.year24.days.Day" + day).getDeclaredConstructor().newInstance();
            instance.printParts();
            System.out.println();
        }
    }

    public static void executeDay(int day) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Day " + day + ":");
        var instance = (Day) Class.forName("vn.com.adventofcode.year24.days.Day" + day).getDeclaredConstructor().newInstance();
        instance.printParts();
    }
}
