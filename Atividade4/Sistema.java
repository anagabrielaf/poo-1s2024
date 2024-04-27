package atividade4.heranca.escola;

import heranca.escola.Diretor;
import heranca.escola.Coordenador;
import heranca.escola.Professor;
import heranca.escola.Aluno;

public class Sistema {
    
    public static void main(String[] args) {
        
        Diretor dir1 = new Diretor("Alfredo", 123456, 33218181, 
        "matutino", 30000.0, "administrativo");
       
        Coordenador coor1 = new Coordenador("Amelia", 563427, 32213030, 
        "matutino", 20000.0, "projetos");

        Professor prof1 = new Professor("Cornelio", 834789, 40028922, "noturno",
        15000.0, "Sociologia");

        Aluno alun1 = new Aluno("Elizabeta", 784563, 34256189, 000000, "vespertino" );
        
        System.out.println(dir1);
        System.out.println(coor1);
        System.out.println(prof1);
        System.out.println(alun1);
    
    }

}
    
    
}