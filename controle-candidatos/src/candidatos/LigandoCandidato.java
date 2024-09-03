package candidatos;

import java.util.Random;

public class LigandoCandidato {

    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Juan", "Paul", "Ingrese"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) 
                tentativasRealizadas++;
            else 
                System.out.println("Contanto realizado com sucesso");
            

        }while(continuarTentando && tentativasRealizadas<3);

        if (atendeu) 
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
            else
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo tentativas " + tentativasRealizadas + " realizadas.");
            
        

    }

    
    
    //Métedo Auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}
