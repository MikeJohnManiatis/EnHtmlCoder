package com.EnHtmlCoder.EnHtmlCoder.service;

import com.EnHtmlCoder.EnHtmlCoder.service.EncodingService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EncodingServiceUnitTests {

    @Autowired
    @Qualifier(value = "TextEncodingService")
    EncodingService<String, String> encodingService;

    @Test
    public void testEncode() {
        String test = encodingService.handleInput(getTestParagraph());
        Assert.assertEquals(encodingService.handleInput(getTestParagraph()), getTestEncodedParagraph());
    }

    private String getTestParagraph() {
        return "Me llamo Pedro y hoy quiero hablar del parque que hay junto a mi casa. "    +
                "Yo me divierto todos los días en el parque. Allí veo las palomas comi"     +
                "endo y bebiendo agua. También veo pájaros de colores en los árboles. Yo "  +
                "voy al parque a las cinco de la tarde, cuando termino los deberes de la esc" +
                "uela. Allí veo a mi amigo Juan y a mi amigo Luis. Con ellos juego al escondite y" +
                " a otros juegos muy entretenidos. Luis se va más temprano del parque porque tiene " +
                "que ir a la escuela de música a aprender a tocar el piano.";
    }

    private String getTestEncodedParagraph() {
        return "Me llamo Pedro y hoy quiero hablar del parque que hay junto a mi casa. "    +
                "Yo me divierto todos los d&#237;as en el parque. All&#237; veo las palomas comi"     +
                "endo y bebiendo agua. Tambi&#233;n veo p&#225;jaros de colores en los &#225;rboles. Yo "  +
                "voy al parque a las cinco de la tarde, cuando termino los deberes de la esc" +
                "uela. All&#237; veo a mi amigo Juan y a mi amigo Luis. Con ellos juego al escondite y" +
                " a otros juegos muy entretenidos. Luis se va m&#225;s temprano del parque porque tiene " +
                "que ir a la escuela de m&#250;sica a aprender a tocar el piano.";
    }
}
