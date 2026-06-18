class StaticCounter {
    static int count = 0;

    StaticCounter() {
        count++;
    }

    public static void main(String[] args) {
        new StaticCounter();
        new StaticCounter();
        new StaticCounter();

        System.out.println("Objects Created: " + count);
    }
}
