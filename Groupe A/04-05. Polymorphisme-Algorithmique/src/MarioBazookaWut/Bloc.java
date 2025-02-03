package MarioBazookaWut;

public class Bloc implements Explosif {
    @Override
    public void exploser() {
        System.out.println("Le bloc fait tomber 5 pièces en explosant");
    }
}
