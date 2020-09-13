package labs_examples.exception_handling.labs;

public class ReadingController {
    boolean morePages = true;

    public static void main(String[] args) {
        ReadingController obj = new ReadingController();
        try {
            obj.flipPage();
        } catch (EndOfBookException e) {
            System.out.println("You finished the book");
            System.out.println(e.getMessage());
        }
    }
    public int flipPage() throws EndOfBookException {
        if(!morePages){
            EndOfBookException eob = new EndOfBookException("There are no more pages");
            throw eob;
        }
        return 1;
    }
}
