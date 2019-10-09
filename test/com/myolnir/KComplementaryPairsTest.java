package com.myolnir;

import org.junit.Assert;
import org.junit.Test;


public class KComplementaryPairsTest {

    private static final int[] ARRAY_1 = new int[]{1,5,3,4,2};
    private static final int[] ARRAY_2 = new int[]{1,3,5,8,6,4,2};
    private static final int[] ARRAY_3 = new int[]{8, 6, 2, -4, 5, -3, 0, 9, 12, -3, -12, 21};
    private static int K;

    @Test
    public void test_algorithm_with_ARRAY_1() {
        K = 2;
        int pairs = KComplementaryPairs.complementaryPairs(ARRAY_1, K);
        Assert.assertEquals(3, pairs);
    }

    @Test
    public void test_algorithm_with_ARRAY_2() {
        K = 2;
        int pairs = KComplementaryPairs.complementaryPairs(ARRAY_2, K);
        Assert.assertEquals(5, pairs);
    }

    @Test
    public void test_algorithm_with_ARRAY_3() {
        K = 8;
        int pairs = KComplementaryPairs.complementaryPairs(ARRAY_3, K);
        Assert.assertEquals(3, pairs);
    }
}
