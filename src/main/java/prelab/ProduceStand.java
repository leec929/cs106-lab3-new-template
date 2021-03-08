package prelab;

import java.util.ArrayList;

public class ProduceStand {
	// fields
	private ArrayList<String> produceNames;
	private double totalAsset;
	private String standName;
	
	// constructor
	public ProduceStand(ArrayList<String> namesOfProduce, double assetsTotal, String name) {
		produceNames = namesOfProduce;
		totalAsset = assetsTotal;
		standName = name;
	}
	
	// getter methods
	public double getTotalAsset() { return totalAsset; }
	public String getStandName() { return standName; }
	public int getNumItems() { return produceNames.size(); }
	
	@Override
	public String toString() {
		return standName + " is worth $" + totalAsset + " and sells " + produceNames.toString();
	}
}
