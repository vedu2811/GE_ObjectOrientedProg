import java.util.ArrayList;
import java.util.List;

public class StockList {
    private List<Stock> stocks;
    public StockList() {
        this.stocks = new ArrayList<>();
    }
    public void addStock(Stock stock) {
        this.stocks.add(stock);
    }
    public double calculateTotalValue() {
        double totalValue = 0.0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        double totalValue = calculateTotalValue();

        for (Stock stock : stocks) {
            double stockValue = stock.calculateStockValue();
            System.out.println("Name: "+stock.getName()+", Number of shares: "+stock.getNumberOfShares()+", Share Price: "+stock.getSharePrice()+", Total Value: "+stockValue);
        }
        System.out.println("OVERALL TOTAL VALUE: "+ totalValue);
    }
}