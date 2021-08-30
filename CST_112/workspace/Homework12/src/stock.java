
public class stock {
	
	String symbol;
	String name;
	double prevClosingPrice;
	double currentPrice;
	
	public stock(String symbol, String name, double prevClosingPrice, double currentPrice){
		this.symbol = symbol;
		this.name = name;
		this.prevClosingPrice = prevClosingPrice;
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent(){
		if(prevClosingPrice > currentPrice)
			return -(((prevClosingPrice / currentPrice)) * 100) + 100;
		else
			return ((currentPrice / prevClosingPrice) * 100) - 100;
	}
	
}
