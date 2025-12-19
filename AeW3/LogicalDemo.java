public class LogicalDemo {
    public static void main(String[] args) {
        boolean hasID = true;
        boolean hasTicket = true;

        System.out.println("Can enter event? " + (hasID && hasTicket)); // && is logical AND
        System.out.println("Can watch online? " + (hasID || hasTicket)); // || is logical OR
        System.out.println("No access? " + (!hasID)); // ! is logical NOT
    }
}
