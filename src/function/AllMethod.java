package function;

public class AllMethod {
    void greeting(){
        System.out.println("Hello Java");
    }

    void greetingName(String name){
        System.out.println("Hello "+name);
    }

    String greetingParam(){
        String name = "Hello";
        return name;
    }

    String getName(String name){
        return name;
    }
    
}
