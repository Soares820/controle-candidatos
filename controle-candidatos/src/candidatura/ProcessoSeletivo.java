package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
    }


static void imprimirSelecionados(){

    String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO",};
    System.out.println("Imprimindo a lista de candidatos iformando o indice do elemento");
    for(int indice = 0; indice < candidatos.length;indice++) {
        System.out.println("O Candidatos de numero" + indice + " é " + candidatos[indice]);

    }
}

static void selecaoCandidatos(){

    String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA"};
     int candidatosSelecionados = 0;
     int candidatosAtual = 0; 
     double salarioBase = 2000.0;
     while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
         String candidato = candidatos [candidatosAtual];
         double salarioPretendido = valorPrentendido();
         System.out.println("O Candidato" + candidato + "Solicitou  este valor de salario " + salarioPretendido );
    
        if(salarioBase >= salarioPretendido) {
            System.out.println( "O Candadito " + candidato + " Foi selecionado para vaga");
            candidatosSelecionados++; 
        }
        candidatosAtual++;

        }
}

  static double valorPrentendido() {
       return ThreadLocalRandom.current() .nextDouble(1800, 2200);
  }
    
    
    
    static void analisarCandidato(double salarioPretendido){
         double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)

        System.out.println("LIAGAR PARA O CANDIDATO");


        else if(salarioBase==salarioPretendido)
         System.out.println("LIGAR PARA CANDIDATO PARA FAZER CONTRA PROPOSTA " );

         else {

            System.out.println("AGURDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
         }
    

    }
}
