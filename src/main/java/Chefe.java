public class Chefe extends InteligenciaArtificial{

    public int ataque() {
        return this.getVida() * 2 * this.getPoder();
    }

    @Override
    public String getTipo() {
        return "Chefe";
    }
}