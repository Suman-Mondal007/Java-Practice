class SharedBuffer {
    private int data;
    private boolean hasData = false;

    // Producer method
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait if buffer is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify(); // notify consumer
    }

    // Consumer method
    public synchronized int consume() {
        while (!hasData) {
            try {
                wait(); // wait if buffer is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // notify producer
        return data;
    }
}

// Producer Thread
class Producer extends Thread {
    private SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

// Main Class
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}