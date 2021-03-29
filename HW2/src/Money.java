
public class Money {
    private long hrn;
    private byte coins;

    public Money(long hrn, byte coins) {
        if (hrn < 0 || coins < 0) {
            System.out.println("Coins/hryvnia can`t be less than 0");
            this.hrn = hrn;
            this.coins = coins;
        } else {
            this.coins = coins;
            this.hrn = hrn;
        }

        if (coins > 100) {
            ++hrn;
            coins -= 100;
        }
        this.coins = coins;
        this.hrn = hrn;

    }


    @Override
    public String toString() {
        return + hrn + "," + coins;
    }

    public Money sum(Money forSum) {
        long hrn = this.hrn + forSum.hrn;
        byte coins = (byte) (this.coins + forSum.coins);
        if (coins > 100) {
            ++hrn;
            coins -= 100;
        }
        return new Money(hrn, coins);
    }

    public Money subtraction(Money forSub) {
        long hrn = this.hrn - forSub.hrn;
        byte coins = (byte) (this.coins - forSub.coins);
        if (hrn < 0 && coins < 0) {
            coins *= -1;
        } else if (coins < 0) {
            hrn *= -1;
            coins *= -1;
        }

        if (coins > 100) {
            ++hrn;
            coins -= 100;
        }
        return new Money(hrn, coins);
    }

    public Money divisionOfSums(Money forDiv) {
        double firstSum = (this.hrn * 100 + this.coins);
        double secondSum = (forDiv.hrn * 100 + forDiv.coins);
        double result = firstSum / secondSum;
        long hrn = (long) result;
        short coins = (short) ((result % hrn) * 100);
        if (coins > 100) {
            ++hrn;
            coins -= 100;
        }
        return new Money(hrn, (byte) coins);

    }

    public Money divByFraction(float num) {
        double sum = (this.hrn * 100 + this.coins);
        double result = sum / num;
        long hrn = (long) result;
        short coins = (short) ((result % hrn) * 100);

        if (coins > 100) {
            ++hrn;
            coins -= 100;
        }
        return new Money(hrn, (byte) coins);
    }

    public Money multiplicationByNum(float num) {
        double sum = (this.hrn * 100 + this.coins);
        double result = sum * num;
        long hrn = (long) result;
        short coins = (short) ((result % hrn) * 100);

        if (coins > 100) {
            ++hrn;
            coins -= 100;
        }
        return new Money(hrn, (byte) coins);
    }

   /* @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money secondMoney = (Money) obj;
            return this.hryvnia == secondMoney.hryvnia && this.kopeck == secondMoney.kopeck;
        }
        return false;
    }*/


 /*   public boolean isEqual(Object money) {
        if (money instanceof Money) {
            Money moneyForEqual = (Money) money;
            double firstSum = (this.hrn * 100 + this.coins) / 100d;
            double secondSum = (moneyForEqual.hrn * 100 + moneyForEqual.coins) / 100d;
            if (firstSum == secondSum) {
                return true;
            }
        }
        return false;
    }*/
 public boolean equals(Object money) {
     if (money instanceof Money) {
         Money moneyForEqual = (Money) money;
         double firstSum = (this.hrn * 100 + this.coins) / 100d;
         double secondSum = (moneyForEqual.hrn * 100 + moneyForEqual.coins) / 100d;
         if (firstSum == secondSum) {
             System.out.println(this.hrn + "," + this.coins + " = "
                     + moneyForEqual.hrn + "," + moneyForEqual.coins);
             return true;
         } else if (firstSum > secondSum) {
             System.out.println(this.hrn + "," + this.coins + " > "
                     + moneyForEqual.hrn + "," + moneyForEqual.coins);
             return false;
         } else {
             System.out.println(this.hrn + "," + this.coins + " < "
                     + moneyForEqual.hrn + "," + moneyForEqual.coins);
             return false;
         }
     }
     return false;
 }
}
