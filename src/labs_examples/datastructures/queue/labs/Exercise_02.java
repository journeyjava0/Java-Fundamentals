package labs_examples.datastructures.queue.labs;

public class Exercise_02 {
    public static void main(String[] args) {
        CustomQueue<String> myCustomQueue = new CustomQueue<>();
        myCustomQueue.add("Birch");
        myCustomQueue.add("Cedar");
        myCustomQueue.add("Spruce");
        myCustomQueue.add("Oak");
        myCustomQueue.printAll();
        System.out.println(" ");

        myCustomQueue.clearAll();
        System.out.println(" ");

        System.out.println(myCustomQueue.getArraySize());
        myCustomQueue.printAll();
    }
}
