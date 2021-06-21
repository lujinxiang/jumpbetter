package algorithm;


import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 其他相关的问题
 * <p>
 * 比如：
 * 1.bitMap实现
 * 2.自己实现队列
 * 3.生产者消费者模式
 * 4.LRU算法实现
 * 5.自己实现线程池
 * 6.自己实现数组的扩容
 * 7.自己实现等等...
 * 8.单列模式的实现
 * 9.工厂模式的实现
 */
public class OtherRelatedProblem {

    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.printThreadNumber();
    }

    /**
     * 单例设计模式
     * <p>
     * 1.饿汉式单例模式
     */
    static final class Single {
        private Single() {

        }

        private static Single instance = new Single();

        public static Single getInstance() {
            return instance;
        }
    }

    /**
     * 2.懒汉式单例模式 （double check+ synchronized同步锁）
     * <p>
     * 使用了双重锁校验
     */
    static final class SingleTwitch {
        private SingleTwitch() {

        }

        //使用volatile禁止指令重排序
        private volatile static SingleTwitch instance = null;

        public static SingleTwitch getInstance() {
            if (instance == null) {
                synchronized (SingleTwitch.class) {
                    if (instance == null) {
                        instance = new SingleTwitch();
                    }
                }
            }
            return instance;
        }

    }

    /**
     * LRU算法实现：双向链表+HashMap
     */
    class LRU<K, V> implements Iterable<K> {
        private Node head;
        private Node tail;
        private HashMap<K, Node> map;
        private int maxSize;

        private class Node {
            Node pre;
            Node next;
            K k;
            V v;

            public Node(K k, V v) {
                this.k = k;
                this.v = v;
            }
        }

        public LRU(int maxSize) {
            this.maxSize = maxSize;
            this.map = new HashMap<>(maxSize * 4 / 3);
            head = new Node(null, null);
            tail = new Node(null, null);
            head.next = tail;
            tail.pre = head;
        }

        public V get(K key) {
            if (!map.containsKey(key)) {
                return null;
            }
            Node node = map.get(key);
            unlink(node);
            appendHead(node);
            return node.v;
        }

        public void put(K key, V value) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                unlink(node);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            appendHead(node);
            if (map.size() > maxSize) {
                Node toRemove = removeTail();
                map.remove(toRemove.k);
            }
        }

        private void unlink(Node node) {
            Node pre = node.pre;
            Node next = node.next;
            pre.next = next;
            next.pre = pre;
            node.pre = null;
            node.next = null;
        }

        private void appendHead(Node node) {
            Node next = head.next;
            node.next = next;
            next.pre = node;
            node.pre = head;
            head.next = node;
        }

        private Node removeTail() {
            Node node = tail.pre;
            Node pre = node.pre;
            tail.pre = pre;
            pre.next = tail;
            node.pre = null;
            node.next = null;
            return node;
        }

        @Override
        public Iterator<K> iterator() {
            return new Iterator<K>() {
                private Node cur = head.next;

                @Override
                public boolean hasNext() {
                    return cur != tail;
                }

                @Override
                public K next() {
                    Node node = cur;
                    cur = cur.next;
                    return node.k;
                }
            };
        }
    }


    /**
     * 两个线程交替打印
     */

    static class PrintThread {
        private volatile boolean flag = false;
        private volatile int num = 1;
        Object object = new Object();

        public void printThreadNumber() {
            Thread thread = new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    while (num < 10) {
                        if (flag) {
                            synchronized (object) {
                                System.out.println(Thread.currentThread().getName() + ":" + num++);
                            }
                        }
                        flag = false;
                        Thread.sleep(5000);
                    }
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    while (num < 10) {
                        if (!flag) {
                            synchronized (object) {
                                System.out.println(Thread.currentThread().getName() + ":" + num++);
                            }
                        }
                        flag = true;
                        Thread.sleep(10000);
                    }
                }
            });
            thread2.start();
            thread.start();
        }
    }

    /**
     * 生产者消费者模型实现
     */

    static class Producer {
        private Resource resource;

        private ArrayBlockingQueue<Resource> arrayBlockingQueue;

        public Producer(Resource resource) {
            this.resource = resource;
        }

        public void produceResource() {
            arrayBlockingQueue.offer(resource);
            resource.resourceIndex++;
        }

    }

    static class Consumer {
        private Resource resource;

        private ArrayBlockingQueue<Resource> arrayBlockingQueue;

        public Consumer(Resource resource) {
            this.resource = resource;
        }

        public void consumeResource() {
            arrayBlockingQueue.poll();
            resource.resourceIndex--;
        }

    }

    static class Resource {
        private String resourceName;
        private Integer resourceIndex;

        public Resource(String resourceName, Integer resourceIndex) {
            this.resourceIndex = resourceIndex;
            this.resourceName = resourceName;
        }
    }

}
