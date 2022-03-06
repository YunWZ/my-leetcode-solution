package com.github.ywz;

/**
 * @author YunWZ
 * @创建时间 2020-04-029:35
 * @description TODO
 */
public class OverridingInternalExample {
  private static class Mammal {
    public void speak() {
      System.out.println("ohlllalalalalalaoaoaoa");
    }
  }

  private static class Human extends Mammal {
    @Override
    public void speak() {
      System.out.println("Hello");
    }

    // Valid overload of speak
    public void speak(String language) {
      if (language.equals("Hindi"))
        System.out.println("Namaste");
      else
        System.out.println("Hello");
    }

    @Override
    public String toString() {
      return "Human Class";
    }
  }

  // 下面的代码包含输出与方法调用字节码
  public static void main(String[] args) {
    Mammal anyMammal = new Mammal();
    anyMammal.speak();
    // Output - ohlllalalalalalaoaoaoa
    // 10: invokevirtual #4 // Method org/programming/mitra/exercises/OverridingInternalExample$Mammal.speak:()V
    Mammal humanMammal = new Human();
    humanMammal.speak();
    // Output - Hello
    // 23: invokevirtual #4 // Method org/programming/mitra/exercises/OverridingInternalExample$Mammal.speak:()V
    Human human = new Human();
    human.speak();
    // Output - Hello
    // 36: invokevirtual #7 // Method org/programming/mitra/exercises/OverridingInternalExample$Human.speak:()V
    human.speak("Hindi");
    // Output - Namaste
    // 42: invokevirtual #9 // Method org/programming/mitra/exercises/OverridingInternalExample$Human.speak:(Ljava/lang/String;)V
  }
}