import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChefeTest {
    @Test
    void deveRetornarAtaque() {
        Chefe chefe = new Chefe();
        chefe.setVida(10);
        chefe.setPoder(1);
        assertEquals(20, chefe.ataque());
    }

    @Test
    void deveRetornarInformacoes() {
        Chefe chefe = new Chefe();
        chefe.setVida(10);
        chefe.setPoder(1);
        chefe.setNome("Balrog");
        assertEquals("Chefe{Nome: Balrog, Vida: 10, Ataque: 20}", chefe.getInfo());
    }

}