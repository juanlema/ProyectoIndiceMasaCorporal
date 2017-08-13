import java.util.*; 
/**
 * Programa para determinar el Indidice de Masa Corporal
 * 
 * @author (Juan León - Leonardo Sotelo) 
 * @version (Agosto 13 de 2017)
 */
public class IndiceMasaCorporal
 {
    public static void main (String[] args)
    {
		Scanner teclado= new Scanner(System.in);
		String nombre;
		String respuesta = "s";
		double peso;
		double estatura;
		double IMC;
		int i = 1;

		String nombreMayor = "";
		double imcMayor = 0;

		while (respuesta.equals("s")) {
			System.out.println("Persona: " + i);
			i++;
			System.out.print(" \n introduce tu nombre : ");
			nombre=teclado.next();
			System.out.print(" \n introduce tu peso : ");
			peso = teclado.nextDouble();
			System.out.print(" \n introduce tu estatura : ");
			estatura = teclado.nextDouble();

			IMC=10000*peso/(estatura*estatura);

			if(IMC > imcMayor){
				imcMayor = IMC;
				nombreMayor = nombre;
			}

			System.out.println (nombre+":"+ "Tu indice de masa corporal es: "+ IMC + "\n");
			if (IMC>18.5 && IMC<24.9) {
			System.out.println("TU PESO ES IDEAL O NORMAL" + "\n"); 
			}
			if (IMC<18.5)   {
			System.out.println("ESTAS BAJO DE PESO" + "\n");
			}
			if (IMC>25 && IMC<29.9) {
			System.out.println("TIENES SOBRE PRESO" + "\n"); 
			}
			if (IMC>30) {
			System.out.println("ESTAS OBESO" + "\n");
			}

			System.out.print( "¿Desea continuar s/n? " );
			respuesta = teclado.next();
		}
		System.out.println("La persona con mayor IMC es: " + nombreMayor);
		System.out.println("con un total de : " + imcMayor + " de IMC.");
 
	}
}