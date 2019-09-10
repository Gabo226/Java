import java.util.*;

class dcuenta
{
 public static void main(String args[])
 {
  int op;
  double s;
  int c;
  String n;
  double m;
  Scanner cuenta1 = new Scanner(System.in);
  cuenta1.nextLine();
  n=cuenta1.nextLine();
  c=cuenta1.nextInt();
  s=cuenta1.nextDouble();
  m=cuenta1.nextDouble();
  cuenta ob=new cuenta(s,n,c);
  System.out.println("1: abonar  2: retirar");
  do{
     op=cuenta1.nextInt();
  }while(op<1&&op>2);
  if(op==1)
    ob.abonar(m);
  else
    ob.retirar(m);
  s=ob.obtenerSaldo();
  System.out.println("El saldo es: "+s);
  ob.imprimir();


cuenta ab = new cuenta(s,n,c);

 double d;
 double r;

n = "Luis";
c = 3024568;
s = 300.00;
d = 550.00;
r = 150.00;

cuenta imp = new cuenta(s,n,c);

	imp.imprimir();
  }
}