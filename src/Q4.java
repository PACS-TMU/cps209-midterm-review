public class Q4 {
    public static void main(String[] args) {
        Letter letter = new Letter("1");
        letter.setSender("John");
        letter.setReceiver("Jane");
        letter.setSubject("Hello");
        letter.setBody("How are you?");
        letter.setFooter("Goodbye");
        letter.print();
    }
}