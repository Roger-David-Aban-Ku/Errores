package metodonumericos;

public class Errores {

    private double valorReal;
    private double valorAproximado;

    public Errores(double valorReal, double valorAproximado) {
        this.valorReal = valorReal;
        this.valorAproximado = valorAproximado;
    }

    double ErrorAbsoluto() {
        double ErrorR = Math.abs(valorAproximado - valorReal);
        return ErrorR;
    }

    double ErrorRelativo() {
        double ErrorA = (ErrorAbsoluto()) / valorReal;
        return ErrorA;
    }

    double ErrorRelativoPorcentual() {
        double ErrorRP = (ErrorRelativo()) * 100;
        return ErrorRP;
    }
}
