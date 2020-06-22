package com.example.demo.serviceimp;
import com.mathworks.toolbox.javabuilder.MWException;
import detect4.testwater;
import embedding7.Class1;
import org.springframework.stereotype.Service;

@Service(value = "testService")
public class testService {

    public String test(String filePath) throws MWException {
        Object result[] = null;
        testwater test = new testwater();
        result = test.detect4(1,filePath);

        return String.valueOf(result[0]);
    }

}
