class cuenta
{
 String nombre;
 int cuenta;
 double saldo;
 double deposito;
 double retiro;
 
 cuenta(double sald, String n, int c)
 { 
  saldo=((sald>0)?sald:0);
  nombre=n;
  cuenta=c;
 }

 void abonar(double monto)
 {
  saldo+=((monto>0)?monto:0);
  deposito=((monto>0)?monto:0);
 }

 Boolean retirar(double monto)
 {
  if(saldo>=monto)
  { 
   saldo=monto;
   retiro=monto;
   return true; 
  }
  else
   System.out.println("Sin saldo");
   return false;
 }
 
 double obtenerSaldo()
 {
  return saldo;
 }

 void imprimir()
 {
  System.out.println("\nLa cuenta "+cuenta+"a nombre de "+nombre+ "tiene un saldo al corte: $" +saldo+ "el monto de sus abonos fueron $"+deposito+" y el de sus retiros $"+retiro);
 }
}