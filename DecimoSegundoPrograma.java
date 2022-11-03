import java.util.Scanner;

public class DecimoSegundoPrograma {

    public static void main(String[] args) {
    float h;//altura da pessoa

    float massa;//a.k.a "peso"

    float imc;     

    Scanner leitura = new Scanner(System.in);
  
    System.out.println("Insira a altura ");

    h = leitura.nextFloat();
       
    imc = (72.7f * h) - 58;
      
    System.out.println("O peso ideal é:"+imc);

    }
   
}