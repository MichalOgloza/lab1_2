package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxCalculationType
{
    public Tax calculateTax(RequestItem item);
}
