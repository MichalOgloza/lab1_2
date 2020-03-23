package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxCalculationType
{
    public void calculateTax(RequestItem requestItem);
}
