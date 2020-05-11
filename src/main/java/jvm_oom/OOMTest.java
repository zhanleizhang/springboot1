package jvm_oom;
import java.util.ArrayList;
import java.util.List;

/**
 *1、 为使内存溢出，尽快出现，可以通过-Xmx20m 设置分配给该Java程序的最大内存
 * 注意至少加上-X+HeapDumpOnOutOfMemoryError
 * 用Java自带的VisualVM进行检测内存溢出的问题
 * 2、在centos中系统，某个JAVA线程被莫名其妙地杀死了，
 * 并且没有dump文件，一开始也不一定定位出是OOM，所以只有查看操作系统的日志
 * 进入/etc/log/messages    操作系统的oom-killer启动，杀掉了java进程，同时该进程在死前，占用了将满（total-vm）
 * 3、本地项目的操作文件进行查看是否存在OutOfMemoryError的问题
 */
public class OOMTest {
    static List<User> list = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            User user = new User("leizi", 12);
            list.add(user);
            System.out.println(list.size());
        }
    }
}

class User
{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

