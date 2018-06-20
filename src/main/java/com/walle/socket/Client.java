package com.walle.socket;

import java.io.*;
import java.net.Socket;

/**
 * 客户端
 * Created by Administrator on 2017/7/7.
 */
public class Client {
    public static void main(String[] args) {
        try {
            //创建客户端Socket，指定服务器地址和端口
            Socket socket = new Socket("localhost", 8888);
            //获取输出流，向复位器发送信息
            OutputStream outputStream = socket.getOutputStream();//字节输出流
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("我是客户端：我连上了");
            printWriter.flush();
            socket.shutdownOutput();//关闭输出流

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String data = null;
            while((data=bufferedReader.readLine())!=null){
                System.out.println("接收到服务器端信息："+data);
            }
            bufferedReader.close();
            inputStream.close();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
