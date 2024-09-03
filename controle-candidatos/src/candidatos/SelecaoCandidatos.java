package candidatos;

import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCandidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
    
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Juan", "Paul", "Ingrese", "Marcel", "Daniela", "John", "Richard", "Ruan"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado<5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado!");
                candidatoSelecionado++;
            }
            candidatoAtual++;
            
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
}
