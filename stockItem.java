
/**
 * Write a description of class stockItem here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
public class stockItem
{
    private int stockNumber;
    private String name;
    private double price;
    private int totalInStock;
    
    public stockItem(int StockNumber, String name, double price, int totalInStock)
    {
        this.stockNumber = stockNumber;
        this.name = name;
        this.price = price;
        this.totalInStock = 0;
    }
    public int getStockNumber()
    {
        return stockNumber;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void addToStock(int quantity)
    {
        totalInStock += quantity;
    }
    public double calculateTotalValue()
    {
        return price*totalInStock;
    }
    public double getPrice()
    {
        return price;
    }
    public int getTotalInStock()
    {
        return totalInStock;
    }
    public String toString()
    {
        return "StockNumber:" + stockNumber + ",name" + name +"price" + price + "Total in Stock" + totalInStock;
    }
}
