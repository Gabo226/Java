import java.util.*;

class dcontrolfiscal
{
	public static void main(String args[])
	{
	String n;
	double salm;
	double dm;
	double dedua;
	double saln;
	double impa;
	double inga;
Scanner sc = new Scanner(System.in);
	sc.nextLine();
	n = sc.nextLine();
	salm = sc.nextDouble();
	dm = sc.nextDouble();
	dedua = sc.nextDouble();
	saln = sc.nextDouble();
	impa = sc.nextDouble();
	inga = sc.nextDouble();
controlfiscal ob = new controlfiscal(n,salm,dm);
	ob.pagoimpuestoanual(dedua,saln,impa);
	ob.ingresonetoanual(inga, impa);
	ob.imprimir();

controlfiscal sinsca = new controlfiscal(n,salm,dm);
	double ingresoa;
	double impuestoa;
	double saldoa;

	n = "Juan López";
	salm = 10000.00;
	dm = 0.00;
	ingresoa = 120000.00;
	impuestoa = 6000.00;
	saldoa = 114000.00;

controlfiscal sin = new controlfiscal(n,salm,dm);
	sin.imprimir();
}
}