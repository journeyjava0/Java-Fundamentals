package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */


//thread 1 prints i / 2 %0 (evens)
//wait until thread 2 is done
//notify thread 2 that thread 1 is done


//thread 2 prints i / 2 %1 of 1 to 100 (odds)
//wait until thread 1 is done
//notify thread 1 that thread 2 is done


//or just use 'synchronized' on the object that prints out the numbers?