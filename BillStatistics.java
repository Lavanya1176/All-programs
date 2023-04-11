import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class BillStatistics {
    public static void main(String[] args) {
        int totalTransactions = 0;
        double totalBillAmount = 0.0, maxBillAmount = Double.MIN_VALUE, minBillAmount = Double.MAX_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader("Bill.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int billNumber = Integer.parseInt(values[0]);
                String date = values[1];
                int customerId = Integer.parseInt(values[2]);
                double billAmount = Double.parseDouble(values[3]);

                totalTransactions++;
                totalBillAmount += billAmount;

                if (billAmount > maxBillAmount) {
                    maxBillAmount = billAmount;
                }
                if (billAmount < minBillAmount) {
                    minBillAmount = billAmount;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Total number of Transactions (bills): " + totalTransactions);
        System.out.println("Total Bill amount: $" + df.format(totalBillAmount));
        System.out.println("Maximum Bill amount: $" + df.format(maxBillAmount));
        System.out.println("Minimum Bill amount: $" + df.format(minBillAmount));
    }
}
