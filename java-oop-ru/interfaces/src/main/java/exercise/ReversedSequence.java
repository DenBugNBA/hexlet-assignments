package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private String line;


    public ReversedSequence(String line) {
        this.line = new StringBuilder(line).reverse().toString();
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public int length() {
        return this.getLine().length();
    }

    @Override
    public char charAt(int i) {
        return this.getLine().charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return this.getLine().subSequence(i, i1);
    }

    public String toString() {
        return this.getLine();
    }

}
// END
