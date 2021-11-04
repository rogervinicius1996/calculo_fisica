
public class App {
    public static void main(String[] args) {
     FisicaCalculos fc = new FisicaCalculos();
      double gravidade = 9.8;
      double massa = 10;
      double velocidade = 30;
      double raio = 5;
      double constante = 0.5;
      double deformacao =  4;
      double distancia = 80;
      double deltaTempo = 5;
      double forca = 20;
      double tempo = 1;
      double distanciaInicial = 0;
      double velocidadeInicial = 5;
      double time = 5;
      double aceleracao = 2;
      double forcaPeso = fc.forcaPeso(gravidade, massa);
      System.out.println("força peso = "+forcaPeso+"N");
      double forcaCentripeta = fc.forcaCentripeta(massa, velocidade, raio);
      System.out.println("força centripeta = "+forcaCentripeta+"N");
      double impulso = fc.impulso(forca, deltaTempo);
      System.out.println("impulso = "+impulso+"N/t");
      double velocidadeMedia = fc.velocidadeMedia(distancia, tempo);
      System.out.println("velocidade média = "+velocidadeMedia+"m/s");
      double forcaElastica = fc.forcaElastica(constante, deformacao);
      System.out.println("força elástica = "+forcaElastica+"N");
      double mruv = fc.mruv(distanciaInicial, velocidadeInicial,time, aceleracao);
      System.out.println("distância = "+mruv+"metros");
       
    }
}
