package com.dom.test;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by zlkjzxj on 2017/7/12.
 */
public class TestDom {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("/books.xml");
            NodeList nodeList = document.getElementsByTagName("book");
            System.out.println(nodeList.getLength());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
