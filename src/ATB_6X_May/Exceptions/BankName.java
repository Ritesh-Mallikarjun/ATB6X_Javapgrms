package ATB_6X_May.Exceptions;

public class BankName {
    String Currency;
    Integer Amount;

    public BankName(String currency, Integer amount) {
        Currency = currency;
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer add(BankName bankName) throws Exception {
        // Custom exception we have created for the bankname
        // If u dont use try and catch , then you need to use throws in the method signature
        // we can use throw keyword inside the try and catch keyword.
        try {
            if(!bankName.Currency.equalsIgnoreCase("INR"))
            {
                throw new Exception("Please enter INR Currency only");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
        Integer sum = this.Amount + bankName.Amount;
        return sum;
    }
}
