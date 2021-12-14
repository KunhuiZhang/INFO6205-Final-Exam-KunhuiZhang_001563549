package neu.info6205.edu;
import org.junit.Test;
import  org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<Integer> graph_from = Arrays.asList(new Integer[]{1,1,2,3,7});
        List<Integer> graph_to = Arrays.asList(new Integer[]{2,3,4,5,8});
        Assert.assertEquals(s.connectedSquareSum(10, graph_from, graph_to),32);
        graph_from = Arrays.asList(new Integer[]{0,1,3,4,7,8});
        graph_to = Arrays.asList(new Integer[]{1,2,4,5,8,9});
        Assert.assertEquals(s.connectedSquareSum(10, graph_from, graph_to),28);
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        List<Integer> graph_from = new ArrayList<>();
        List<Integer> graph_to = new ArrayList<>();
        Assert.assertEquals(s.connectedSquareSum(1000, graph_from, graph_to),1000);
    }
    @Test
    public void test3(){
        Solution s = new Solution();
        Assert.assertEquals(s.connectedSquareSum(0, new ArrayList<>(), new ArrayList<>()),0);
    }
    @Test
    public void test4(){
        Solution s = new Solution();
        Assert.assertEquals(s.connectedSquareSum(1, new ArrayList<>(), new ArrayList<>()),1);
    }
}

