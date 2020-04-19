package boj.solving;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class WeightedAverage {
    public static double mean(List<Integer> numbers, List<Integer> weights)
    {
    	if (numbers == null || weights == null) {
    		throw new IllegalArgumentException();	
    	}
    	if (numbers.size() != weights.size()) {
    		throw new IllegalArgumentException();	
    	}
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal totalWeights = BigDecimal.ZERO;
        for (int i = 0; i < numbers.size(); i++)
        {
        	BigDecimal number = new BigDecimal(String.valueOf(numbers.get(i)));
        	BigDecimal weight = new BigDecimal(String.valueOf(weights.get(i)));
            total.add(number.multiply(weight));
            totalWeights.add(weight);
        }
        
        return total.divide(totalWeights, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });

        System.out.println(WeightedAverage.mean(a, b));
    }
}
