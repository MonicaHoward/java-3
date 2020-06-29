package concurrency;

class Reasoning extends Thread {

    public void run(){
    distinguish();
    }

    void distinguish() {
        System.out.println("The difference between a thread and a process is that a process is a program that is in the act of being executed. Before it is executed it is a program and once it has finished running it is a program. A process may contain a thread. Processes don't share memory space and are larger and more involved than threads. A thread is part of a process or program.");
        System.out.println("If you invoke the run() method of a Thread class you will get an exception. The method that you should run is the .start() method");
    }
}

