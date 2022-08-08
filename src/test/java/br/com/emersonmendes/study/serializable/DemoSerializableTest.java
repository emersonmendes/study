package br.com.emersonmendes.study.serializable;

import br.com.emersonmendes.study.AbstractTest;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoSerializableTest extends AbstractTest {


    @Value("${test.resources}")
    private String testResourcesPath;


    @BeforeEach
    public void before() throws Exception {
        Files.createDirectories(Path.of(testResourcesPath + "/filesForTest"));
    }

    @Test
    public void shouldSerializeAndDeserializeAnObject() throws Exception {

        DemoSerializable demo = new DemoSerializable();
        demo.setAge(33);
        demo.setSomething("Teste");
        demo.setName("Test Name");

        serialize(demo, testResourcesPath + "/filesForTest/demo.ser");

        DemoSerializable demo2 = deserialize(testResourcesPath + "/filesForTest/demo.ser");

        assertThat(demo2.getName()).isEqualTo("Test Name");
        assertThat(demo2.getAge()).isEqualTo(33);
        assertThat(demo2.getSomething()).isEqualTo("Teste");

    }

    private DemoSerializable deserialize(String file) throws IOException, ClassNotFoundException {
        DemoSerializable demo;
        FileInputStream fileIn = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        demo = (DemoSerializable) in.readObject();
        in.close();
        fileIn.close();
        return demo;
    }

    private void serialize(DemoSerializable demo, String file) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(demo);
        out.close();
        fileOut.close();
    }

}
