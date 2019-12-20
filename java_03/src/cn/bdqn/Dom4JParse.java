package cn.bdqn;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4JParse {
    private static Document document=null;
    public static void show() throws  Exception{
        SAXReader reader=new SAXReader();
        document=reader.read("src/cn/bdqn/student.xml");
        Element root=document.getRootElement();
        System.out.println(root.getName());
        List<Element> students=root.elements();
        for (Element student:students) {
            System.out.print(student.getName()+"\t");
            Attribute id=student.attribute("id");
            System.out.print(id.getValue());
            List<Element> elements=student.elements();
            for (Element el:elements) {
                System.out.print(el.getTextTrim());
            }
            System.out.println();


        }

    }

    public static void main(String[] args) throws  Exception {
        show();
    }
}
