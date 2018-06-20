package com.walle.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by walle
 * 2017/10/12.13:50
 * good good study!
 * 服务器处理线程类
 */
public class ServerThread extends Thread {

    //和本线程相关的Socket
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String info = null;
            while((info=bufferedReader.readLine())!=null){//循环读取客户端信息
                System.out.println("我是服务器，客户端说："+info);
            }
            socket.shutdownInput();

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("欢迎你");

            printWriter.flush();//缓冲输出
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
