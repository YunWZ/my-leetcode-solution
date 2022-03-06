package jvmspec.dispatch;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class InvokeDynamicTetst815 {
    public static void main(String[] args) {
        Son s = new Son();
        s.thinking();
    }
}

class GrandFather {
    void thinking() {
        System.out.println("i am grandfather");
    }
}

class Father extends GrandFather {
    void thinking() {
        System.out.println("i am father");
    }

}

class Son extends Father {
    void thinking() {
        MethodType methodType = MethodType.methodType(void.class);
        try {
            MethodHandle thinking = MethodHandles.lookup().findSpecial(GrandFather.class, "thinking", methodType, this.getClass());
            thinking.invoke(this);
        }  catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}