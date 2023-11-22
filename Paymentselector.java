public class Paymentselector {
    public static void main(String[] args) {
        String userChoice = "Union";
        System.out.println("Selected bank: " + userChoice);
        String selectedBank = Bankselector.getSelectedBank(userChoice);
        double transferAmount = 1000.0;
        performTransfer(selectedBank, transferAmount);
    }
    private static void performTransfer(String selectedBank, double amount) {
        if ("SBI".equals(selectedBank)) {
            SBIbank.transfer(amount);
        } else if ("Union".equals(selectedBank)) {
            Unionbank.transfer(amount);

        } else if ("HDFC".equals(selectedBank)) {
            HDFC.transfer(amount);

        } else {
            System.out.println("No selected bank.");
        }
    }
}
