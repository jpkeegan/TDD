package org.example;

import org.junit.*;
import java.util.*;
import java.lang.Math;

public class CollectionTest {
    Collection c = new Collection();

    @Test
    public void testFindMax(){
        List<Integer> numbers = new ArrayList() {{
            for(int i = 1; i < 14; i++) add(i);
        }};
        Assert.assertEquals(13, c.findMax(numbers));
    }

    @Test
    public void textFindMin(){
        List<Integer> numbers = new ArrayList() {{
            for(int i = 1; i < 14; i++) add(i);
        }};
        Assert.assertEquals(1, c.findMin(numbers));
    }

    @Test
    public void testRemoveLessThan(){
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
        c.removeLessThan(numbers, 4);
        Set<Integer> expected = new HashSet<>(Arrays.asList(4, 5));
        Assert.assertEquals(expected, numbers);
    }

    @Test
    public void testRemoveGreaterThan(){
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
        c.removeGreaterThan(numbers, 3);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1,2,3));
        Assert.assertEquals(expected, numbers);
    }

    @Test
    public void testRemoveHalf() {
        Queue<String> strings = new LinkedList<>(Arrays.asList("1", "2", "3", "4", "5"));
        int originalSize = strings.size();
        c.removeHalf(strings);
        int expectedSize = (int) Math.floor(originalSize / 2.0);
        Assert.assertEquals(expectedSize, strings.size());
    }

}
