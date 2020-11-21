package jvmspec.dispatch;

public class DynamicDispatch {
    static abstract class HuMan {
        protected abstract void sayHello();
    }

    static class Man extends HuMan {

        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static class Woman extends HuMan {
        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {
        HuMan man = new Man();
        HuMan woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
