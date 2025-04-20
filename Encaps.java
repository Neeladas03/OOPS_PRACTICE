class Moto{
    private String password;
    private String number;

    public void Setdetails(String pass,String num){
        password=pass;
        number=num;
    }

    public void Getdetails(){
        System.out.println("Password: "+password);
        System.out.println("Phone: "+number);
    }
}

class Main1{
    public static void main(String args[]){
     Moto m=new Moto();
     m.Setdetails("Singam@1234", "8270056152");
     m.Getdetails();

    }
}