class controlfiscal{
	String nombre;
	double salariom;
	double deduccionm;

controlfiscal(String n, double salm, double dm)
	{	
	deduccionm = ((dm<20/100)?dm:0);
	nombre = n;
	salariom = salm;
	}
void pagoimpuestoanual(double dedua, double saln, double impa)
	{
	double impuestoa = impa;
	double salarion = saln;
	double deducciona = dedua;
	if(dedua == 0)
		impuestoa = 5/100;
	else if((deducciona <10/100))
		impuestoa = 15/100;
	else if((deducciona >10/100))
		impuestoa = 25/100;
	}

double ingresonetoanual(double inga, double impa)
	{
	double ingresoa = inga;
	double impuestoa = impa;
	return(ingresoa = impuestoa);
	}

void imprimir()
	{
	double ingresoa = 120000.00;
	double impuestoa = 6000.00;
	double saldoa = 114000.00;
	System.out.println(nombre+"con ingresos mensuales de $"+salariom+"y deducciones de $"+deduccionm+"mesuales percibió un ingreso anual de $"+ingresoa+"con un pago de impuestos anuales de $"+impuestoa+"susalario neto anual fue de $"+saldoa);
   }
 }
		 	