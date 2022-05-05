/**
    Band                Taxable income             Tax rate
    Personal Allowance             Up to  £12,570       0%
    Basic rate                £12,571 to  £50,270      20%
    Higher rate               £50,271 to £150,000      40%
    Additional rate     over £150,000                  45%
 */

double incomeTax(double amount) {
    double tax = 0.0;
    if (amount > 150_000) {
        tax = (amount - 150_000) * 0.45;
        amount = 150_000;
    }

    if (amount > 50_270) {
        tax = tax + (amount - 50_270) * 0.40;
        amount = 50_270;
    }

    if (amount > 12_570) {
        tax = tax + (amount - 12_570) * 0.20;
        amount = 12_570;
    }

    if (amount > 0) {
        tax = tax + (amount - 0) * 0.0;
        amount = 0;
    }

    return tax;
}