# JSigSlot
A pretty simple but fast (O(1)) signal and slot events system.

Example?
```java
import core.SignalSlot;

/**
 * See that the two classes didn't know each other, yet they could easily communicate?
 * 
 */
public class ConsoleTest {
    public static void main(String[] args){
        new ConsoleTest();
        FooMan.foo();
    }
    
    public ConsoleTest(){
        SignalSlot.addSlot("do", slot -> doSomething((String)slot));
    }
    private void doSomething(String foo){
        foo = (foo == null)? "Duhh": foo.concat(foo == "java"? " Rocks!!!" : " Sucks!!");
        System.out.println(foo);
    }
}

class FooMan{
    public static void foo(){
        String doThis = javax.swing.JOptionPane.showInputDialog("Hello, what would you like to do?");
        SignalSlot.emitSignal("do", doThis);
    }
}
```