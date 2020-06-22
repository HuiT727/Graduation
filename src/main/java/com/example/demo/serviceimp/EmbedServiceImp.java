package com.example.demo.serviceimp;

import com.example.demo.service.embedService;
import com.mathworks.toolbox.javabuilder.MWException;
import embedding7.Class1;
import org.springframework.stereotype.Service;

@Service(value = "embedService")
public class EmbedServiceImp implements embedService {

    /**
     *  * @param filename	 要加密的文件名
     * @param tofile	输出文件所在位置和文件名
     * <br/>

     * @return boolean
     * @author HuiT
     * @date 2020/5/24 21:59
     */

    public boolean embeddingFile(String test,String filename,String tofile) throws MWException{
            Class1 cs = new Class1();
            cs.embedding7(filename,test,tofile);
            return true;
    }
}

