package candidatos;

public class ImprimirCandidatos {

    public static void main(String[] args) {

        imprimirSelecionados();
        
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Juan", "Paul", "Ingrese"};

        System.out.println("Imprindo a lista de candidatos informando o indice");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviado de interação for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }


    }

}
