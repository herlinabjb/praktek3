
package praktek3;
public class Bajuaksi {
    public static void main(String[] args) {
       Baju s = new Baju() ;
 
       s.setMerk("dannis");
       s.setUkuran("xl");
       s.setWarna("Hitam");
       s.setModel("polos");
       
       s.cetakInfo();
       
       System.out.print("Merknya \t: ");
       System.out.println(s.getMerk());
       System.out.print("Ukurannya \t: ");
       System.out.println(s.getUkuran());
       System.out.print("Warnanya \t: ");
       System.out.println(s.getWarna());
       System.out.print("Modelnya \t: ");
       System.out.println(s.getModel());
    }
}
