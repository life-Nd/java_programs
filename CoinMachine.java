import java.util.Scanner;

public class CoinMachine {
    static int _cash = 0;
    static int _price = 0;
    static int _change = 0;
    static int _toonies = 0;
    static int _loonie = 0;
    static int _quarter = 0;
    static int _dime = 0;
    static int _nickel = 0;

    public static void main(String[] args) {
        if (args.length != 0 && args[0] != null && args[1] != null) {
            _cash = Integer.parseInt(args[0]);
            _price = Integer.parseInt(args[1]);
        } else {
            final Scanner _scanner = new Scanner(System.in);
            _box("cash received");
            _cash = _scanner.nextInt();
            _box("price of the item");
            _price = _scanner.nextInt();
            _scanner.close();
        }

        _transactionLogger();
        _changeCalculator();

    }

    public static void _box(String text) {
        System.out.println("\t -----------------------------");
        System.out.println("\t Please enter the " + text);
        System.out.println("\t -----------------------------");
    }

    public static void scanner() {

    }

    public static void _transactionLogger() {
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("Amount received: " + _cash);
        System.out.println("Cost of the item: " + _price);

    }

    public static void _changeCalculator() {
        _change = _cash - _price;
        System.out.println("Required change: " + _change + "\n");
        if (_change < 0) {
            System.out.println("🚫 Please add more cash!🚫 \n   Missing " + _change + " ❗️ \n");
        } else if (_change == 0.0) {
            System.out.println("✅ No change required! ✅ \n");
            System.out.println("Exiting the program \n");
        } else {
            while (_change >= 200) {
                _change = _change - 200;
                _toonies = _toonies + 1;
            }
            while (_change >= 100) {
                _change = _change - 100;
                _loonie = _loonie + 1;
            }
            while (_change >= 25) {
                _change = _change - 25;
                _quarter = _quarter + 1;
            }
            while (_change >= 10) {
                _change = _change - 10;
                _dime = _dime + 1;
            }
            while (_change >= 5) {
                _change = _change - 5;
                _nickel = _nickel + 1;
            }
            _changeViewer();
        }

    }

    public static void _changeViewer() {
        System.out.println("Change: ");
        System.out.println(" toonies x " + _toonies);
        System.out.println(" loonie x " + _loonie);
        System.out.println(" quarter x " + _quarter);
        System.out.println(" dime x " + _dime);
        System.out.println(" nickel x " + _nickel + "\n");
        System.out.println("✅ All the _change given ✅ \n");
        System.out.println("Exiting the program 😎\n");
    }
}
