package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocationHandler implements InvocationHandler {

    private Object student;

    StudentInvocationHandler(Object student) {
        this.student = student;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass().getInterfaces().length);
        Object result = method.invoke(student, args);
        return result;
    }
}
