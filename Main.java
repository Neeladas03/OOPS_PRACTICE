class Das{
    int age;
    double height;
    double weight;
    String color;

    public void physical(){
        System.out.println("Das can take 20kg pullups");
        System.out.println("Das can take 55 pushups");
        System.out.println("Das can do 170kg deadlifts");
        System.out.println("Das can benchpress 90kg");
        System.out.println("Das can Sqaut 100kg");
    }

    public void skills(){
        System.out.println("Das can solve dsa problems");
        System.out.println("Das can do react projects");
        System.out.println("Das can learn and adapt to things easily");
        System.out.println("Das has good communication skills");
    }

    public void stats(){
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Color: "+color);
    }

}

class Main{
    public static void main(String args[]){
        
        Das d=new Das();
        d.age=20;
        d.height=171.2;
        d.weight=62.3;
        d.color="brown";
        
        d.physical();
        d.skills();
        d.stats();

    }
}