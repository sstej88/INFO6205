package edu.neu.coe.info6205.threesum;

import edu.neu.coe.info6205.threesum.ThreeSum;
import edu.neu.coe.info6205.threesum.ThreeSumQuadratic;
import edu.neu.coe.info6205.threesum.Triple;

import java.util.Arrays;

public class Main {

    public static void test1() {
        int[] ints = new int[]{-1, 0, 1, 2, -1, -4};
        Arrays.sort(ints);
        
        ThreeSumCubic t12 = new ThreeSumCubic(ints);
        Triple[] triple2 = t12.getTriples();
        ThreeSumQuadratic t13 = new ThreeSumQuadratic(ints);
        Triple[] triple3 = t13.getTriples();
        ThreeSumQuadrithmic t14 = new ThreeSumQuadrithmic(ints);
        Triple[] triple4 = t14.getTriples();
    }
    public static void test2() {
        int[] ints = new int[]{1, 0 , 3 , 17, 7, 9};
        Arrays.sort(ints);
        
        ThreeSumCubic t12 = new ThreeSumCubic(ints);
        Triple[] triple2 = t12.getTriples();
        ThreeSumQuadratic t13 = new ThreeSumQuadratic(ints);
        Triple[] triple3 = t13.getTriples();
        ThreeSumQuadrithmic t14 = new ThreeSumQuadrithmic(ints);
        Triple[] triple4 = t14.getTriples();
    }
    public static void test3() {
        int[] ints = new int[]{2,7,11,15, 3, 2, 8};
        Arrays.sort(ints);
        
        ThreeSumCubic t12 = new ThreeSumCubic(ints);
        Triple[] triple2 = t12.getTriples();
        ThreeSumQuadratic t13 = new ThreeSumQuadratic(ints);
        Triple[] triple3 = t13.getTriples();
        ThreeSumQuadrithmic t14 = new ThreeSumQuadrithmic(ints);
        Triple[] triple4 = t14.getTriples();
    }
    public static void test4() {
        int[] ints = new int[]{30, -40, -20, -10, 40, 0, 10, 5};
        Arrays.sort(ints);
        
        ThreeSumCubic t12 = new ThreeSumCubic(ints);
        Triple[] triple2 = t12.getTriples();
        ThreeSumQuadratic t13 = new ThreeSumQuadratic(ints);
        Triple[] triple3 = t13.getTriples();
        ThreeSumQuadrithmic t14 = new ThreeSumQuadrithmic(ints);
        Triple[] triple4 = t14.getTriples();
    }
    public static void test5() {
        int[] ints = new int[]{10, 3, -4, 1, -6, 9};
        Arrays.sort(ints);
        
        ThreeSumCubic t12 = new ThreeSumCubic(ints);
        Triple[] triple2 = t12.getTriples();
        ThreeSumQuadratic t13 = new ThreeSumQuadratic(ints);
        Triple[] triple3 = t13.getTriples();
        ThreeSumQuadrithmic t14 = new ThreeSumQuadrithmic(ints);
        Triple[] triple4 = t14.getTriples();
    }
    public static void test6() {
        int[] ints = new int[]{7, 12, 3, 1, 2, -6, 5, -8, 6};
        Arrays.sort(ints);
        
        ThreeSumCubic t12 = new ThreeSumCubic(ints);
        Triple[] triple2 = t12.getTriples();
        ThreeSumQuadratic t13 = new ThreeSumQuadratic(ints);
        Triple[] triple3 = t13.getTriples();
        ThreeSumQuadrithmic t14 = new ThreeSumQuadrithmic(ints);
        Triple[] triple4 = t14.getTriples();
    }
    public static void main(String[] args) {
        System.out.println("Testcase 1");
        test1();
        System.out.println("Testcase 2");
        test2();
        System.out.println("Testcase 3");
        test3();
        System.out.println("Testcase 4");
        test4();
        System.out.println("Testcase 5");
        test5();
        System.out.println("Testcase 6");
        test6();
    }
}
