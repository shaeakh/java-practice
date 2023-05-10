package constructoroverloading;

public class Teacher {
    
    String name,gender;
    int age;
    
    Teacher(){
        System.out.println("No Information"); //1st constructor 
    }
    
    Teacher(String n,String g,int a){ //2nd constructor 
        name = n;
        gender = g;
        age = a;
    }
    
    Teacher(String n,String g){ //3rd constructor 
        name = n;
        gender = g;
    }
    void dis(){
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Age :"+age);
    }
}
