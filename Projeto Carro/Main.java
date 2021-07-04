package br.ufc.qx;

public class Runner {

    public static void main(final String[] args) {
        //Criando um carro
        Carro carro = new Carro();
        System.out.println(carro); // Carro{passageiros=0, combustivel=0, quilometragem=0}

        //Embarcando duas pessoas
        carro.embarcar();
        carro.embarcar();
        System.out.println(carro); // Carro{passageiros=2, combustivel=0, quilometragem=0}

        //Tentando embarcar mais uma pessoas
        if(!carro.embarcar()) {
            System.out.println("Não foi possível realizar o embarque"); // Não foi possível realizar o embarque
        }

        //Desembarcando
        carro.desembarcar();
        carro.desembarcar();
        if(!carro.desembarcar()) {
            System.out.println("Não foi possível desembarcar"); // Não foi possível desembarcar
        }

        //Abastecendo
        carro.abastecer(60);
        System.out.println(carro); // Carro{passageiros=0, combustivel=60, quilometragem=0}

        //Dirigir
        if(!carro.dirigir(10)) {
            System.out.println("Não foi possível dirigir porque o carro estava vazio"); // Não foi possível dirigir porque o carro estava vazio
        }

        //Embarcando e dirigindo
        carro.embarcar();
        carro.dirigir(10);
        System.out.println(carro); // Carro{passageiros=1, combustivel=50, quilometragem=10}

        // Dirigindo até acabar o combustível
        int quilometragemAntigo = carro.getQuilometragem();
        if(!carro.dirigir(70)) {
            int distancia = carro.getQuilometragem() - quilometragemAntigo;
            System.out.println("O combustível acabou ao percorrer " + distancia + " kms"); // O combustível acabou ao percorrer 50 kms
        }
        System.out.println(carro); // Carro{passageiros=1, combustivel=0, quilometragem=60}

        // Abastecendo
        carro.abastecer(200); 
        System.out.println(carro); // Carro{passageiros=1, combustivel=100, quilometragem=60}

    }
}