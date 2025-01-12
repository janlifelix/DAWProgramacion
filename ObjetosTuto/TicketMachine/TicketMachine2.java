package TicketMachine;

public class TicketMachine2 {
    /**
     * TicketMachine models a ticket machine that issues
     * flat-fare tickets.
     * The price of a ticket is specified via the constructor.
     * Instances will check to ensure that a user only enters
     * sensible amounts of money, and will only print a ticket
     * if enough money has been input.
     * 
     * @author David J. Barnes and Michael Kölling
     * @version 2016.02.29
     */
    public class TicketMachine {
        // The price of a ticket from this machine.
        private double price;
        // The amount of money entered by a customer so far.
        private double balance;
        // The total amount of money collected by this machine.
        private double total;
        // El dinero que falta para pagar el ticket.
        private double amountToPay = price - balance;

        /**
         * Create a machine that issues tickets of the given price.
         */
        public TicketMachine(int cost) {
            price = cost;
            balance = 0;
            total = 0;
        }

        /**
         * @Return The price of a ticket.
         */
        public double getPrice() {

            return price;
        }

        /**
         * Return The amount of money already inserted for the
         * next ticket.
         */
        public double getBalance() {
            return balance;
        }

        private boolean setDescuento() {
            amountToPay = price * 0.8 - balance;
            price = price * 0.8;
            return true;
        }

        /**
         * Receive an amount of money from a customer.
         * Check that the amount is sensible.
         */
        public void insertMoney(int amount) {
            if (amount > 0) {
                balance = balance + amount;
            } else {
                System.out.println("Use a positive amount rather than: " +
                        amount);
            }
        }

        /**
         * Print a ticket if enough money has been inserted, and
         * reduce the current balance by the ticket price. Print
         * an error message if more money is required.
         */
        public void printTicket() {
            if (setDescuento()) {
                if (balance >= price) {
                    // Simulate the printing of a ticket.
                    System.out.println("##################");
                    System.out.println("# The BlueJ Line");
                    System.out.println("# Ticket");
                    System.out.println("# " + price + " cents.");
                    System.out.println("Discounted 20% of total price.");
                    System.out.println("##################");
                    System.out.println();

                    // Update the total collected with the price.
                    total = total + price;
                    // Reduce the balance by the price.
                    balance = balance - price;
                } else {
                    System.out.println("You must insert at least: " +
                            (amountToPay) + " more cents.");
                }
            } else {
                if (balance >= price) {
                    System.out.println("##################");
                    System.out.println("# The BlueJ Line");
                    System.out.println("# Ticket");
                    System.out.println("# " + price + " cents.");
                    System.out.println("##################");
                    System.out.println();

                    total = total + price;
                    balance = balance-price;
                    
                } else {
                    System.out.println("You must insert at least: " +
                            (amountToPay) + " more cents.");
                }
            }
        }

        /**
         * Return the money in the balance.
         * The balance is cleared.
         */
        public double refundBalance() {
            double amountToRefund;
            amountToRefund = balance;
            balance = 0;
            return amountToRefund;
        }

        public double emptyMachine() {
            double temp = total;
            total = 0;
            return temp;
        }
    }
}
