package de.tha.prog2.task02;

public class DataAnalyzer {
	
	public double min(double[] values) {
		double x = Double.MAX_VALUE;
		
		for(int i = 0; i < values.length; i++) {
			if(x >= values[i]) {
				x = values[i];
			}
		}
		
		return x;
	}
	
	public double max(double[] values) {
		double x = Double.MIN_VALUE;
		
		for(int i = 0; i < values.length; i++) {
			if(x <= values[i]) {
				x = values[i];
			}
		}
		
		return x;
	}
	
	public double sum(double[] values) {
		double x = 0;
		
		for(int i = 0; i < values.length; i++) {
			x += values[i];
		}
		
		return x;
	}
	
	public double mean(double[] values) {
		double x = 0;
		
		for(int i = 0; i < values.length; i++) {
			x += values[i];
		}
		
		x /= values.length;
		
		return x;
	}
	
	public double sampleVariance(double[] values) {
		double mean = mean(values);
        double sumSquaredDiff = 0;

        for (double value : values) {
            double diff = value - mean;
            sumSquaredDiff += diff * diff;
        }
        
        return sumSquaredDiff / (values.length - 1);
	}
	
	public AnalysisResult analyze(double[] values) {
		double min = min(values);
	    double max = max(values);
	    double sum = sum(values);
	    double mean = mean(values);
	    double variance = sampleVariance(values);
	    
	    return new AnalysisResult(min, max, sum, mean, variance);
	}
	
	public void sort(double[] values, boolean desc) {
		double x = 0;
		
		if(desc == false) {
			for(int i = 0; i < values.length - 1; i++) {
				if(values[i] > values[i+1]) {
					x = values[i];
					values[i] = values[i+1];
					values[i+1] = x;
					
					i--;
				}
			}
		}
		
		if(desc == true) {
			for(int i = 0; i < values.length - 1; i++) {
				if(values[i] < values[i+1]) {
					x = values[i];
					values[i] = values[i+1];
					values[i+1] = x;
					
					i--;
				}
			}
		}
	}
	

}
