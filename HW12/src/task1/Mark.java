package task1;

public class Mark {
    int mark;
    String textMark;

    public Mark(int mark) {
        this.mark = mark;
    }

    public void displayTextMark() {
        textMark = switch (mark) {
            case 0, 1, 2, 3, 4 -> "very bad";
            case 5 -> "bad";
            case 6 -> "acceptable";
            case 7, 8 -> "good";
            case 9, 10 -> "well";

            default -> "unexpected value";
        };
        System.out.println("Text mark: " + textMark);
    }
}
