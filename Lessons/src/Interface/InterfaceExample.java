/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

public class InterfaceExample {
    public static void main(String[] args) {
        HelloInterface hello = new SpanishHello();
        System.out.println(hello.sayHello());
    }
}
