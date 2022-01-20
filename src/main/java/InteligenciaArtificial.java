public abstract class InteligenciaArtificial {
    private int vida;
    protected String nome;
    private int poder;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public abstract int ataque();

    public String getTipo() {
        return "NPC";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "Nome: " + this.nome +
                ", Vida: " + this.vida +
                ", Ataque: " + this.ataque() +
                "}";
    }
}
