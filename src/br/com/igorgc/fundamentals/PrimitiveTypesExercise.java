package br.com.igorgc.fundamentals;

/*
Crie variáveis para os campos descritos abaixo entre ‹ e imprima a seguinte mensagem:
Eu <nome>, morando no endereco ‹endereço>, confirmo que recebi o salário de ‹salario>, na data ‹data›
*/

public class PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Pedro";
        String address = "Av.Álvares Cabral";
        double salary = 5431.12;
        String payDay = "08/09/2026";
        String report = "Eu "+name+" morando no endereço " +address+" confirmo que recebi o salário de "+salary+", na data "+payDay;
        System.out.println(report);
    }
}
