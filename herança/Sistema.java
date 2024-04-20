package herança;

import herança.empresa.Engenheiro;

public class Sistema {

public static void main(String[] args){
Engenheiro eng1 = new Engenheiro("Joao", 123, 123, "crea 1", "Orientação a Objeto");
Engenheiro eng2 = new Engenheiro("Ana Gabriela", 124, 124, "crea 2", "Orientação a Objeto");

Gerente ger1 = new Gerente("JP", 125, 125, 2000000.0, 2);

Diretor dir1 = new Diretor("Ana", 126, 126, 300300.0);

System.out.println(eng1);
System.out.println(eng2);
System.out.println(ger1);
System.out.println(dir1);
}


}
