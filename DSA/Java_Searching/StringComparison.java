package Java_Searching;

public class StringComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;

        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;

        System.out.println("Time taken using StringBuffer: " + durationBuffer / 1_000_000 + " ms");
        System.out.println("Time taken using StringBuilder: " + durationBuilder / 1_000_000 + " ms");
    }
}

