/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session06.compress_decompress.zlib;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Deflater_Inflater {

    public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {
        // Encode a String into bytes 
        String input = "The Deflater class compresses the data. The Deflater class compresses the data. The Deflater class compresses the data. The Deflater class compresses the data.";
        byte[] inputObj = input.getBytes("UTF-8");
        System.out.println("String: " + inputObj.length + " bytes.");
        // Compress the bytes	
        byte[] output = new byte[inputObj.length];
        Deflater deflater = new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDataLength = deflater.deflate(output);
        System.out.println("Compressed: " + compressDataLength + " bytes.");

        // Decompress the bytes 
        Inflater inflaterObj = new Inflater();
        inflaterObj.setInput(output, 0, output.length);
        byte[] resultObj = new byte[inputObj.length];
        int resultLength = inflaterObj.inflate(resultObj);
        inflaterObj.end();
        // Decode the bytes into a String 
        String strOutput = new String(resultObj, 0, resultLength, "UTF-8");
        System.out.println("Recovered string is: " + strOutput);
    }
}
