public class AsciiToChar {
    public static void main(String[] args) {
        int[] asciiValues = {65, 66, 67, 68, 69};
        for (int value : asciiValues) {
            System.out.print((char) value + " ");
        }
    }
}