public class TASK1LAB7 {
        public static void main(String[] args){
            Animal a1=new Dog();
            Animal a2=new Cat();
            Animal a3=new Cow();
            a1.sound();
            a2.sound();
            a3.sound();
        }
    }
    class Animal{
        public void sound(){
        }
    }
    class Dog extends Animal {
        @Override
        public void sound(){
            System.out.println("dog says woof woof");
        }
    }

    class Cat extends Animal {
        @Override
        public void sound(){
            System.out.println("cat says meow meow");
        }
    }
    class Cow extends Animal{
        @Override
        public void sound(){
            System.out.println("cow says mooo mooo");
        }
    }

