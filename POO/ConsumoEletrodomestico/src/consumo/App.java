package consumo;

public class App {

    public static void main(String[] args) {

        EletroDomestico eletro = new EletroDomestico(
            "Geladeira",
            100,
            8
        );

        double precoKwh = 1.00;

        System.out.println("===== RELATÓRIO =====");


        System.out.println("Consumo diário: "
                + eletro.consumoDiarioWh() + " Wh");

        System.out.println("Consumo mensal: "
                + eletro.consumoMensalWh() + " Wh");

        System.out.println("Consumo anual: "
                + eletro.consumoAnualWh() + " Wh");

        System.out.println("Gasto mensal: R$ "
                + eletro.gastoMensal(precoKwh));
    }
}