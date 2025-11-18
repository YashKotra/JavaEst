class RuntimeDemo {
    void divide() {
        throw new ArithmeticException("Cannot divide");
    }

    public static void main(String[] args) {
        RuntimeDemo d = new RuntimeDemo();
        try {
            d.divide();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
