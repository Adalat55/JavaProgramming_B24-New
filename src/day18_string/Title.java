package day18_string;

public class Title {
    public static void main(String[] args) {
        String name = "Dr James Jr";

        if(name.startsWith("Mr")){
            System.out.println("hello Mr");
        }else if(name.startsWith("Mrs")){
            System.out.println("hello miss");
        }else if(name.startsWith("Dr")){
            System.out.println("hello doctor, what did you study?");
        }else if(name.startsWith("Madam")){
            System.out.println("hello Madam");
        }

        if(name.endsWith("Jr")){
            System.out.println("Hello junior");
        }else if(name.endsWith("Sr")){
            System.out.println("Hello senior");
        }

    }
}
