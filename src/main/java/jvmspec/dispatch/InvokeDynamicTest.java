package jvmspec.dispatch;

import static java.lang.invoke.MethodHandles.lookup;

import java.lang.invoke.*;

public class InvokeDynamicTest {
    public static void main(String[] args) throws Throwable {
//        INDY_BootstrapMethod().invokeExact("icyfenix");
        Integer a = 1;
        Integer b= 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c==d);//true
        //"=="运算在不遇到算术运算符的情况下不会自动拆箱?
        System.out.println(e==f);//false
        System.out.println(c==(a+b));//true
        System.out.println(c.equals(a+b));//t
        System.out.println(g==(a+b));//t
        System.out.println(g.equals(a+b));//f
        System.out.println(g.equals(1+2));//f
        System.out.println(f==(a+320l));//t
    }

    public static void testMethod(String s) {
        System.out.println("hello String:" + s);
    }

    public static CallSite BootstrapMethod(MethodHandles.Lookup lookup, String name, MethodType mt) throws NoSuchMethodException, IllegalAccessException {
        return new ConstantCallSite(lookup.findStatic(InvokeDynamicTest.class, name, mt));
    }

    private static MethodType MT_BootstrapMethod() {
        return MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava" +
                "/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", null);
    }

    private static MethodHandle MH_BootstrapMethod() throws NoSuchMethodException, IllegalAccessException {
        return lookup().findStatic(InvokeDynamicTest.class, "BootstrapMethod", MT_BootstrapMethod());
    }

    private static MethodHandle INDY_BootstrapMethod() throws Throwable {
        CallSite cs = (CallSite) MH_BootstrapMethod().invokeWithArguments(lookup(), "testMethod", MethodType.fromMethodDescriptorString(
                "(Ljava/lang/String;)V", null
        ));
        return cs.dynamicInvoker();
    }
}
