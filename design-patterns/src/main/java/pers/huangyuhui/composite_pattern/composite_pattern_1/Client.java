package pers.huangyuhui.composite_pattern.composite_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/11/2019-12:36 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        try {
            System.out.println("------ Making Root Entries ------");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory temdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(temdir);
            rootdir.add(usrdir);
            bindir.add(new File("demo1.class", 10000));
            bindir.add(new File("demo2.class", 20000));
            rootdir.printList();

            System.out.println("\n" + "------ Making User Entries ------");
            Directory demoDir1 = new Directory("demoDir1");
            Directory demoDir2 = new Directory("demoDir2");
            Directory demoDir3 = new Directory("demoDir3");
            usrdir.add(demoDir1);
            usrdir.add(demoDir2);
            usrdir.add(demoDir3);
            demoDir1.add(new File("demo.html", 100));
            demoDir1.add(new File("demo.java", 200));
            demoDir2.add(new File("demo.txt", 300));
            demoDir3.add(new File("demo.doc", 400));
            demoDir3.add(new File("demo.mail", 500));
            rootdir.printList();
        } catch (FileTreatMentException e) {
            e.printStackTrace();
        }

    }
}
