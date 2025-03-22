/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class grandfather{
    
    private String name;
    private int age;
    private boolean hassuperpower;
    public boolean hassuperpower(){
        return hassuperpower;
    }
       public grandfather(){
           hassuperpower=false;
        System.out.println("grandfather constructor called");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
	public static void main(String[] args) {
	    child c=new child();
	   // System.out.println(c.hassuperpower());
	}
}
class parent extends grandfather{   
    public parent(){
    System.out.println("parent constructo");
    }
}
class child extends parent{
    public child(){
        System.out.println("child constructor");
    }
    
}