public class Monstro extends InteligenciaArtificial {
    public int ataque() {
        return this.getVida() * this.getPoder();
    }

    @Override
    public String getTipo() {
        return "Monstro";
    }
}
