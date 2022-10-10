import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Functions<Integer>(10);
        try {
            q.push(1);
            System.out.println(q.size());
            q.push(1);
            System.out.println(q.size());
            q.pop();
            System.out.println(q.size());
            q.push(2);
            System.out.println(q.size());
            q.pop();
            System.out.println(q.size());
            q.push(1);
            System.out.println(q.size());
            q.push(1);
            System.out.println(q.size());
            q.push(1);
            System.out.println(q.size());
            q.pop();
            System.out.println(q.size());
            q.push(18);
            System.out.println(q.size());

            Class theClass = q.getClass();
            Method[] llistaMetodes = theClass.getDeclaredMethods();
            System.out.println(Arrays.asList(llistaMetodes));
            Field[] llistaAttr = theClass.getDeclaredFields();
            System.out.println(Arrays.asList(llistaAttr));
        }
        catch (FullQueueException fullExp) {
            System.out.println("EXCEPCIÓ!!");
            fullExp.printStackTrace();
        }
     catch (EmptyQueueException empty) {
            System.out.println("EXCEPCIÓ!!");
            empty.printStackTrace();
        }
    }
}