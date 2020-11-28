package labs_examples.datastructures.hashmap.labs.myHashMap.Timing;

public class Timer {

   long start = 0;
   long diff = 0;
   String name = " ";

    public Timer(String name) {
        this.name = name;
    }

    public long getStart() {
        return start;
    }

    public long getDiff() {
        return diff;
    }

    public void startTimer() {
        start = System.currentTimeMillis();
    }

    public long endTimer(long start) {
        long endTime = System.currentTimeMillis();
        diff = endTime - start;
        return diff;
    }

    public long howLongAdd() {
        System.out.println(name + " takes " + getDiff() + " milliseconds, to add 100000 items");
        return getDiff();
    }

    public long howLongSearch() {
       System.out.println(name + " takes " + getDiff() + " milliseconds, to search 100000 items");
       return getDiff();
    }

    public long howLongDelete() {
        System.out.println(name + " takes " + getDiff() + " milliseconds, to delete 100000 items");
        return getDiff();
    }

    public void totalTime(){
        long sum = howLongAdd() + howLongSearch() + howLongDelete();
        System.out.println(name + " takes " + sum + " milliseconds, to complete all tasks");
    }
}
