import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StockList stocklist=new StockList();
        System.out.println("Enter number of stocks: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Enter stock name: ");
            String name=sc.nextLine();
            System.out.println("Enter number of shares: ");
            int shares=sc.nextInt();
            System.out.println("Enter share price: ");
            double sharePrice=sc.nextDouble();
            Stock newStock = new Stock(name,shares,sharePrice);
            stocklist.addStock(newStock);
        }
        stocklist.printStockReport();
    }
}