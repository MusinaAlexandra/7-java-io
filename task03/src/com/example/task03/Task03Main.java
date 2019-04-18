package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        try (ByteArrayOutputStream result = new ByteArrayOutputStream()) {
            int symbol;
            while ((symbol = inputStream.read()) > -1) {
                result.write(symbol);
            }
            return result.toString(charset.name());
        }
    }
}
