package Aula3_TM.Pratica1;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("A");
        p1.setCpf("5");

        Pessoa p2 = new Pessoa();
        p2.setNome("B");
        p2.setCpf("2");

        Pessoa p3 = new Pessoa();
        p3.setNome("C");
        p3.setCpf("4");

        Pessoa p4 = new Pessoa();
        p4.setNome("D");
        p4.setCpf("3");

        Pessoa p5 = new Pessoa();
        p5.setNome("E");
        p5.setCpf("1");

        Pessoa[] arr = {p5,p2,p3,p1,p4};
        
        SortUtils.sort(arr);

        for (Pessoa p: arr) {
            System.out.println("Nome: " + p.getNome() + " CPF: " + p.getCpf());
        }

        Celular[] arrCel = {
            new Celular(1133423142, "Mauri"),
            new Celular(1166453723, "Joice"),
            new Celular(1142355362, "Kenyo"),
            new Celular(1133636241, "Michelle")
        };
	
		SortUtils.sort(arrCel);
		
		for(Celular c: arrCel) {
			System.out.println(c);
		}
        
    }
}
