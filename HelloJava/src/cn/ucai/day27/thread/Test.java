package cn.ucai.day27.thread;
class Target {
    private int count;
    public synchronized void increase() {
        if (count == 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName() + ":" + count);
        notify();
    }
    public synchronized void decrease() {
        if (count == 0) {
            try {
                // �ȴ�������Decrease�̵߳��õĸ÷���,
                // ����Decrease�߳̽������t(main������ʵ������)�ĵȴ��أ������ͷŶ���t����
                wait();// Object��ķ���
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName() + ":" + count);
        // �����߳�Increase��Increase�̴߳ӵȴ��ص�����
        notify();
    }
}
class Increase extends Thread {
    private Target t;
    public Increase(Target t) {
        this.t = t;
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.increase();
        }
    }
}
class Decrease extends Thread {
    private Target t;
    public Decrease(Target t) {
        this.t = t;
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                // ���˯��0~500����
                // sleep�����ĵ��ã������ͷŶ���t����
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.decrease();
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Target t = new Target();
        Thread t1 = new Increase(t);
        t1.setName("Increase");
        Thread t2 = new Decrease(t);
        t2.setName("Decrease");
        t1.start();
        t2.start();
    }
}