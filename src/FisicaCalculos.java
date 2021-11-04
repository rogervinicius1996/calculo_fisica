import java.lang.Math;
public class FisicaCalculos {
    public double forcaPeso(double g, double m){
        return g*m;
    }
    public double forcaCentripeta(double m, double v, double r){
        return (Math.pow(v, 2) * m)/r;
    }
    public double impulso(double f, double dT){
        return f * dT;
    }
    public double forcaElastica(double c, double d){
        return c * d;
    }
    public double velocidadeMedia(double d, double t){
        return d / t;
    }
    public double mru(double d, double t){
        return d / t;
    }
    public double mruv(double di, double vo, double t, double a){
        return di + (vo * t) + (a * Math.pow(t,2)) /2;
    }
}