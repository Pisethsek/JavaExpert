package datatypeVariable;

class People{
    static int id; //static variable]
    int age; //instance variable

    void hello(String text){
        String name = "Seth"; //local variable
        System.out.println("Hello "+ text+ "\t"+name);
    }
}

public class DemoDatatype {
    public static void main(String[] args) {
        /* 
         * Variable in Java is a data container that stores the data values during Java program execution. Every variable is assigned a data type, which designates the type and quantity of values it can hold. Variable is a memory location name of the data. The Java variables have mainly three types: Local, Instance and Static.
        */

        //datatype has deivide into 2 parts is :
        //primitive datatype
        //wrapper class

        //primitive
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400;

        float f = 500;
        double d = 600;

        char c = 'K';
        boolean bl = true;

        //wrapper
        Byte B;x
        Short S;
        Integer I;
        Long L;

        Float F;
        Double D;

        Character ch;
        Boolean BL;


    }
}
