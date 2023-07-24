public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Jon 'Bones' jones", "USA", 36, 1.88, 113.6, 27, 1, 1);
        l[1] = new Lutador("Charles 'do Bronx' Oliveira", "Brasil", 33, 1.78, 70.1, 34, 9, 1);
        l[2] = new Lutador("Khamzat 'Borz' Chimaev", "Suécia", 29, 1.88, 81.5, 12, 0, 0);
        l[3] = new Lutador("Zé mané", "Chile", 26, 1.79, 114.5, 15, 5, 1);
        l[4] = new Lutador("Tulio tulipas", "Suiça", 18, 1.67, 71.5, 8, 6, 0);
        l[2] = new Lutador("Nissin Ourfali", "Israel", 37, 1.76, 87.9, 27,8, 0);
        l[2].apresentar();
    }
}