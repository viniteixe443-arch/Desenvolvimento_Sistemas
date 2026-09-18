package consumo;

public class EletroDomestico {

    private double potenciaWatts;
    private double horasPorDia;

    public EletroDomestico(String nome, double potenciaWatts, double horasPorDia) {
        this.potenciaWatts = potenciaWatts;
        this.horasPorDia = horasPorDia;
    }

    public double consumoDiarioWh() {
        return potenciaWatts * horasPorDia;
    }

    public double consumoMensalWh() {
        return consumoDiarioWh() * 30;
    }

    public double consumoAnualWh() {
        return consumoMensalWh() * 12;
    }

    public double gastoMensal(double precoKwh) {
        double consumoKwh = consumoMensalWh() / 1000;
        return consumoKwh * precoKwh;
    }
    
}