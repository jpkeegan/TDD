package org.example;

import java.util.*;
import java.lang.Math;

public class Collection {
    /**
     * Given a list of integers, return the highest integer
     * @param numbers - a list of integers
     * @return the largest integer
     */
    public static int findMax(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    /**
     * Given a list of integers, return the lowest integer
     * @param numbers - a list of integers
     * @return the smallest integer
     */
    public static int findMin(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    /**
     * Given a set of integers, remove all integers which are less than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeLessThan(Set<Integer> numbers, int target) {
        numbers.removeIf(x -> x < target);
    }

    /**
     * Given a set of integers, remove all integers which are greater than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeGreaterThan(Set<Integer> numbers, int target) {
        numbers.removeIf(x -> x > target);
    }

    /**
     * Given a queue of strings, remove half of all strings
     * Specifically, the size of the queue after the method is invoked should be equal to
     * floor(N/2) where N is the original size
     * @param strings - the queue of strings to mutuate
     */
    public static void removeHalf(Queue<String> strings) {
        int originalSize = strings.size();
        int halfSize = (int) Math.ceil(originalSize / 2.0);
        System.out.println(halfSize);
        int removed = 0;
        for(int i = 0; i < halfSize; i++){
            strings.remove();
            removed ++;
        }
        System.out.println(removed);
    }
}
