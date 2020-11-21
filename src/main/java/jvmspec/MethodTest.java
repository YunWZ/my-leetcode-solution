package jvmspec;

import jvmspec.inte.InterfaceA;
import jvmspec.inte.InterfaceAchild1;
import jvmspec.klass.Father;
import jvmspec.klass.Father1;

public class MethodTest extends Father1  implements InterfaceA{
    public int getB() {
        return 2;
    }
    public static void main(String[] args) {
        MethodTest methodTest = new MethodTest();
        System.out.println(methodTest.getd());
        methodTest.getB();
    }

    private int getC(){
        return 3;
    }
}
