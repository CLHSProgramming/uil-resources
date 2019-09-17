public class Main
{
    public static void main( String[] args )
    {
        CheckingAccount mine = new CheckingAccount( "Juan", 10.84 );
        mine.deposit( 120.76 );
        System.out.println( mine );
        CheckingAccount yours = new CheckingAccount( "Bob", 0.01 );
        System.out.println( ( "" + 6.43754 ).substring( 4 ) );
        yours.stealFrom( mine );
        System.out.println( "Bob stole from Juan!" );
        System.out.println( yours );
        System.out.println( mine );
    }

    static class CheckingAccount
    {
        private double amount;
        private String name;

        public CheckingAccount( String _name, double _amount )
        {
            name = _name;
            amount = _amount;
        }

        public void deposit( double money )
        {
            amount += money;
        }

        public void withdraw( double money )
        {
            amount -= money;
        }

        public double getAmount()
        {
            return amount;
        }

        public void stealFrom( CheckingAccount other )
        {
            deposit( other.getAmount() );
            other.withdraw( other.getAmount() );
        }

        public String toString()
        {
            return name + "'s account has $" + amount + " in it.";
        }
    }
}
