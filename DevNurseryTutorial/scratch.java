//class Scratch {
//    public static void main(String[] args) {
//        String myNumStr = "7";
//        int myNum = 7;
//        Boolean myBool = false;
//        double myDouble = 55.66;
//
//        System.out.println("Hello World! " + myNum + args[1]);
//    }
//}

//public class Scratch {
//    public static void main(String[] args){
//        Boolean bool = true;
//        if(bool) {
//            for(int i = 0; i < 10; i++) {
//                print("It's true. I have said this " + (i + 1) + " times!");
//            }
//        }
//    }
//    static void print(String printArg){
//        System.out.println(printArg);
//    }
//
//}

//public class Scratch {
//    public static void main(String[] args){
//       String name = "Hunter";
//       switch(name) {
//           case "Hunter":
//               print("Hello, " + name);
//               break;
//           case "Steve":
//               print("Hello, " + name);
//               break;
//           default:
//               print("LIAR!");
//       }
//    }
//    static void print(String printArg){
//        System.out.println(printArg);
//    }
//}

//public class Scratch {
//    public static void main(String[] args){
////        String[] names = {"Bob", "Hunter", "Carol"};
//          String[] names = new String[3];
//          names[0] = "Bob";
//        for(int i = 0; i < names.length; i ++) {
//            print(names[i]);
//        }
//    }
//    static void print(String printArg){
//        System.out.println(printArg);
//    }
//}

public class Scratch {
    static int one = 1;
    static int two = 2;
    int three = 3;

    public static void main(String[] args){
//        String[] names = {"Bob", "Hunter", "Carol"};
//        String[] names = new String[3];
//        names[0] = "Bob";
//        for(int i = 0; i < names.length; i ++) {
//            Print.ln(names[i]);
//        }
        Fun.printAdd(one, two);
        Fun.printAdd(6, 6);

        var f = new Fun();

        Print.ln(Integer.toString(f.add(1, 1)));

        var Sparky = new Dog("Sparky", 5);

        Print.ln(Sparky.name + " is " + Sparky.age + " years old.");
        Sparky.bark();

        var Todo = new SmallDog("Lil Bit", 3);

        Print.ln(Todo.name + " is " + Todo.age + " years old.");
        Todo.bark();
    }
}

public class Print {
    public static void ln (String output){
        System.out.println(output);
    }
}


class Fun {
    public static void printAdd (int num1, int num2) {
        Print.ln(Integer.toString(num1 + num2));
    }
    public int add (int num1, int num2) {
        return num1 + num2;
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void bark(){
        Print.ln("bark!");
    }
}

class SmallDog extends Dog {
    public SmallDog(String name, int age){
        super(name, age);
    }

    public void bark(){
        Print.ln("Yip!");
    }
}
























//










