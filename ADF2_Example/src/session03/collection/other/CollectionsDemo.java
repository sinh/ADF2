/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03.collection.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import session03.collection.Student;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List<Student> lst = new ArrayList();
        //Thêm sinh viên vào danh sách
        lst.add(new Student("A33333", "Nguyen Van Z"));
        lst.add(new Student("A11111", "Nguyen Van E"));
        lst.add(new Student("A55555", "Nguyen Van X"));
        lst.add(new Student("A22222", "Nguyen Van B"));
        lst.add(new Student("A44444", "Nguyen Van A"));
        lst.add(new Student("A66666", "Nguyen Van F"));
        //lst.add("Hello");

        //Sắp xếp theo rollNo vì lớp Student đã implements Comparable interface
        Collections.sort(lst);
        System.out.println("Sắp xếp theo mã sinh viên: ");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        //Thực hiện sắp xếp theo tên sinh viên
        Collections.sort(lst, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    return s1.getName().compareTo(s2.getName());
                }
                return 0;
            }
        });

        System.out.println("\nSắp xếp theo tên: ");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}
