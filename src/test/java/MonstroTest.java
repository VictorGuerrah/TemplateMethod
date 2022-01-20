import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MonstroTest {
    @Test
    void deveRetornarAtaque() {
        Monstro monstro = new Monstro();
        monstro.setVida(10);
        monstro.setPoder(1);
        assertEquals(10, monstro.ataque());
    }

    @Test
    void deveRetornarInformacoes() {
        Monstro monstro = new Monstro();
        monstro.setVida(10);
        monstro.setPoder(1);
        monstro.setNome("Orc");
        assertEquals("Monstro{Nome: Orc, Vida: 10, Ataque: 10}", monstro.getInfo());
    }

}