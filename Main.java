/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Juet{
    String name;
    int age;
    
   
    
    public String getName(){
       return name;
        
    }
    
    public int getAge(){
         return age;
    }
    
    public void set(String n,int a){
       this.name=n;
        this.age=a;
    }
    
    
}

public class Main{
     public static void main(String args[]){
         Juet juet=new Juet();
         juet.set("SAPNA TIWARI",21);
         System.out.println(juet.getName());
         System.out.println(juet.getAge());
     }
}



