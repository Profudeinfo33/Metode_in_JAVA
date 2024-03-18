public class Main {
    public static void main(String[] args) {
        String fname;
        String lname;

        Get_Set nume=new Get_Set();
        nume.setFname("Dinu");
        nume.setLname("Petre");
        System.out.println(nume.getFname()+" "+nume.getLname());
       int suma= Suma(20,30);
        System.out.println(suma);
    }

    public static int Suma(int numar1, int numar2){
        return numar1+numar2;
     }
}