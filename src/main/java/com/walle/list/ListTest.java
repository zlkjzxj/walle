package com.walle.list;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

import java.util.*;

/**
 * List�е�Ԫ����
 * Created by zlkjzxj on 2017/7/7.
 */
public class ListTest {
    public List courses;

    public ListTest(){
        this.courses = new ArrayList();
    }

    public List testAdd(){
        //add
        Course course1 = new Course("1","���ݽӿ�");
        courses.add(course1);

        //add������
        Course course2 = new Course("2","��ѧ����");
        courses.add(0,course2);

        Course[] course3 = {new Course("3","ë��"),new Course("4","��ѧ����")};
        //��Ӷ��
        courses.addAll(Arrays.asList(course3));

        //ָ��λ����Ӷ��
        Course[] course4 = {new Course("3","���"),new Course("4","��ѧ��ʱ���")};

        courses.addAll(2,Arrays.asList(course4));

        Set<String> set = new HashSet<String>();
        for (int i = 0; i <courses.size() ; i++) {
            Course c= (Course) courses.get(i);
            if (set.add(c.getId())){
                //�µ�list�����
            }
        }


        //�޸�listԪ��
        courses.set(0,new Course("1","���ү"));
        //ɾ��listԪ��
        courses.remove(5);

        return courses;

    }

    public static void main(String[] args) {
        List list = new ListTest().testAdd();
//        for (int i = 0; i < list.size(); i++) {
//            Course course = (Course) list.get(i);
//            System.out.println(course.getId()+":"+course.getName());
//        }
        Iterator iterator =list.iterator();
        while(iterator.hasNext()){
            Course course1 = (Course) iterator.next();
            System.out.println(course1.getName());
        }

        //listȥ�أ�nubia;
//        List<String> list1 = new ArrayList();
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        list1.add("1");
//        list1.add("3");
//        list1.add("4");
//        list1 = new ArrayList(new TreeSet(list1));
//        for (int i = 0; i <list1.size() ; i++) {
//            System.out.println(list1.get(i).toString());
//        }

            Map<String,Course> map = new HashMap<String, Course>();
            map.put("1",new Course("1","XIAOMING"));
            map.put("2",new Course("2","XIAOMING"));
            map.put("3",new Course("3","XIAOMING"));
            Set<String> set =map.keySet();

        for (Course course1:map.values()) {
            System.out.println(course1.getId());
        }
    }
}
