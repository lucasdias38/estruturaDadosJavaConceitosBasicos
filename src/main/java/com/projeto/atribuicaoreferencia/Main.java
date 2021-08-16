package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main (String[] args){
        //  Declarando valores em variáveis e atribuindo dado de uma variável em outra.
        System.out.println("#################################\n     Atribuição de Valores");

        int intA =1;
        int intB = intA;
        System.out.println("intA= " + intA + " intB= "+ intB);

        intA =2;    //Aletrando valor da variável intA, assim mostrando que são independentes
        System.out.println("intA= " + intA + " intB= "+ intB);

        //  Declarando valores em objetos e referenciando os valores;
        System.out.println("#################################\n     Referênciando Objetos");

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA= " + objA + " objB= "+ objB);
            /*  Quando ocorre referência de objeto, o que se altera em um, altera no outro automaticamente,
                  pois não há atribuição, assim criando um vinculo entre os mesmos.*/
        objA.setNum(2);
        System.out.println("objA= " + objA + " objB= "+ objB);
        objB.setNum(3);
        System.out.println("objA= " + objA + " objB= "+ objB);
    }
}
