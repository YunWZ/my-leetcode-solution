package jvmspec;

import jvmspec.inte.InterfaceA;
import jvmspec.inte.InterfaceAchild1;
import jvmspec.klass.Father;

public class FieldTest  implements InterfaceAchild1 {
//    int a= 3;

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        FieldTest fieldTest = new FieldTest();
        System.out.println(fieldTest.getA());
    }
}
