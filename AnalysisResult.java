package de.tha.prog2.task02;

import java.util.Locale;

public class AnalysisResult {
	
	private double min;
	private double max;
	private double sum;
	private double mean;
	private double sampleVariance;
	
	public AnalysisResult(double min, double max, double sum, double mean, double sampleVariance) {
		this.min = min;
		this.max = max;
		this.sum = sum;
		this.mean = mean;
		this.sampleVariance = sampleVariance;
	}

	public Double getMin() {
		// TODO Auto-generated method stub
		return min;
	}

	public Double getMax() {
		// TODO Auto-generated method stub
		return max;
	}

	public Double getSum() {
		// TODO Auto-generated method stub
		return sum;
	}

	public Double getMean() {
		// TODO Auto-generated method stub
		return mean;
	}

	public Double getSampleVariance() {
		// TODO Auto-generated method stub
		return sampleVariance;
	}

	@Override
	public String toString() {
		return String.format(Locale.US, "AnalysisResult{min=%.1f, max=%.1f, sum=%.1f, mean=%.1f, sampleVariance=%.1f}", getMin(),
				getMax(), getSum(), getMean(), getSampleVariance());
	}

}
