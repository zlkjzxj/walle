package com.walle.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 * Created by Administrator on 2017/7/7.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /**
         * 单线程的写法
         //1.创建服务器端,指定绑定端口，并监听此端口
         ServerSocket serverSocket = new ServerSocket(8888);
         System.err.print("服务器开始监听");
         //2.调用accept()方法开始监听，等待客户端连接
         Socket socket = serverSocket.accept();
         //2.获取输入流，并读取客户端信息
         InputStream inputStream = socket.getInputStream();
         InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//输入字节流转换成字符流
         BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//缓冲字符流
         String data=null;
         while ((data=bufferedReader.readLine())!=null){// 按行读
         System.out.println("我是服务端：接收到的客户端信息是："+data);
         }
         //获取输出流，输出信息给客户端
         OutputStream outputStream = socket.getOutputStream();
         PrintWriter printWriter = new PrintWriter(outputStream);
         printWriter.write("知道了，你登录吧");
         printWriter.flush();
         socket.shutdownOutput();
         printWriter.close();
         outputStream.close();
         bufferedReader.close();
         inputStreamReader.close();
         inputStream.close();
         socket.close();
         serverSocket.close();

         */

        /**
         * 多线程写法
         */
        ServerSocket serverSocket = new ServerSocket(8888);

        System.out.println("服务器启动，等待客户端连接");

        //记录连接客户端的个数
        int count = 0;
        //循环监听等待客户端的链接
        while (true) {
            Socket socket = serverSocket.accept();
            //创建一个新的线程
            ServerThread serverThread = new ServerThread(socket);
            //启动线程
            serverThread.start();
            count++;
            System.out.println("连接的客户端数量为：" + count);
        }
//        serverSocket.close();//这是一个死循环所以执行不到这里
    }
}
